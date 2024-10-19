package itstep.less2.dz;

import java.util.Scanner;
public class dz3 {
   static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {

        int a = inputDigital("першу");
        int b = inputDigital("другу");
        int c = inputDigital("третю");

        int d=a*100+b*10+c;
        System.out.println("Отримали число "+d);
    }

    /**
     *
     * @param digital рядок для виводу заголовку
     * @return введена цифра
     */
    public static int inputDigital(String digital) {
        int e = 10;
        int n = 0;
        while (e < 0 || e > 9) {
            if (n > 0) {
                System.out.println("Це не цифра. Спробуйте ще раз.");
            }
            n += 1;

            System.out.print("Введіть " + digital + " цифру:");
            try {
                e = myObj.nextInt();
            } catch(Exception ex) {
                myObj.nextLine();
                e=10;
            }
        }
        return e;
    }
}
