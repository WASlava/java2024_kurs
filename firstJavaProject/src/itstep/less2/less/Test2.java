package itstep.less2.less;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a");

        int a = myObj.nextInt();

        System.out.println("Enter b");
        int b = myObj.nextInt();

        int c =a+b;
        System.out.println("a + b = " + c);
    }
}
