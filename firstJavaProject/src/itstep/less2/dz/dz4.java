package itstep.less2.dz;
import java.util.Scanner;

public class dz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть шестизначне число: ");
        String number = scanner.nextLine();


        if (number.length() == 6 && number.matches("\\d+")) {

            String swappedNumber = swapDigits(number);

            System.out.println("Результат після зміни цифр: " + swappedNumber);
        } else {

            System.out.println("Помилка: введене число не є шестизначним.");
        }
    }

    /**
     *
     * @param number введене число у вигляді рядка
     * @return перевернуте число у вигляді рядка
     */
    public static String swapDigits(String number) {
        // Перетворюємо число на масив символів
        char[] digits = number.toCharArray();

        // Змінюємо місцями першу та шосту цифри
        char temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;

        // Змінюємо місцями другу та п'яту цифри
        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;


        return new String(digits);
    }
}


