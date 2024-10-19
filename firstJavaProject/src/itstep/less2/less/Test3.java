package itstep.less2.less;

import java.util.Scanner;

public class Test3 {
    public static int inv(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Введіть чотиризначне число");
        int d = myObj.nextInt();

        if (d >= 1000 && d <= 9999) {
            int reverse = inv(d);
            System.out.println("Перевернуте число: " + reverse);
        } else {
            System.out.println("Число не є чотиризначним. Спробуйте ще раз.");
        }
    }
}
