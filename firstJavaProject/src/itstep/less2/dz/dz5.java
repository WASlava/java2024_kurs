package itstep.less2.dz;
import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (від 1 до 12): ");
        int month = scanner.nextInt();


        if (month >= 1 && month <= 12) {
            switch (month) {
                case 12: case 1: case 2:
                    System.out.println("Winter");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Spring");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Summer");
                    break;
                case 9: case 10: case 11:
                    System.out.println("Autumn");
                    break;
            }
        } else {

            System.out.println("Помилка: введено невірний номер місяця.");
        }
    }
}
