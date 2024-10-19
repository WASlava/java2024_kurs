package itstep.less2.dz;
import java.util.Scanner;

public class dz7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох чисел
        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        System.out.println("Непарні числа в діапазоні від " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                if (i==end || i==(end-1)) {
                    System.out.println(i);
                } else {
                    System.out.print( i + ", ");
                }

            }
        }
    }
}

