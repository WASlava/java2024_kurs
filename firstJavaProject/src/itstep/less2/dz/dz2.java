package itstep.less2.dz;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Введіть число:");

        int a = myObj.nextInt();

        System.out.print("Введіть процент: ");
        int b = myObj.nextInt();

        double c =a*b/100;
        System.out.println(b+"% від " + a +" = " + c);
    }
}
