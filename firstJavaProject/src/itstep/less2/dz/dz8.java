package itstep.less2.dz;
import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число діапазону: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число діапазону: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);


        for (int i = start; i <= end; i++) {
            System.out.println("Таблиця множення для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
