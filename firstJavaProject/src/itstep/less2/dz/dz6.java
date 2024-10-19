package itstep.less2.dz;
import java.util.Scanner;

public class dz6 {
    static double meters;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i == 0) {
            System.out.print("Введіть кількість метрів: ");
            try {
                meters = scanner.nextDouble();
                i = 1;
            } catch (Exception ex) {
                scanner.nextLine();
                System.out.println("Ви ввели не число. Спробуйте ще.");

            }
        }
        // Вибір одиниці виміру для конвертації
        System.out.println("Виберіть одиницю виміру для конвертації:");
        System.out.println("1. Милі");
        System.out.println("2. Дюйми");
        System.out.println("3. Ярди");
        System.out.print("Ваш вибір: ");
        int choice = scanner.nextInt();

        // Конвертація в залежності від вибору
        switch (choice) {
            case 1:
                double miles = meters * 0.000621371;
                System.out.println(meters + " метри = " + miles + " милі.");
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println(meters + " метри = " + inches + " дюйми.");
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println(meters + " метри = " + yards + " ярди.");
                break;
            default:
                System.out.println("Помилка: невірний вибір.");
        }
    }
}
