package itstep.less2.dz;
import java.util.ArrayList;
import java.util.Random;


public class dz10 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        int n = random.nextInt(15) + 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2*n+1) - n; // Випадкові числа від -n до n
        }

        int evenCount = 0, oddCount = 0, negativeCount = 0, positiveCount = 0;

        // Перший прохід: рахуємо кількість елементів для кожної категорії
        for (int num : array) {
            if (num % 2 == 0) evenCount++;
            if (num % 2 != 0) oddCount++;
            if (num < 0) negativeCount++;
            if (num > 0) positiveCount++;
        }

        // Створюємо масиви відповідного розміру
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int[] negativeNumbers = new int[negativeCount];
        int[] positiveNumbers = new int[positiveCount];

        // Індекси для заповнення нових масивів
        int evenIndex = 0, oddIndex = 0, negativeIndex = 0, positiveIndex = 0;

        // Другий прохід: заповнюємо нові масиви
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num; // Парні числа
            } else {
                oddNumbers[oddIndex++] = num; // Непарні числа
            }
            if (num < 0) {
                negativeNumbers[negativeIndex++] = num; // Від'ємні числа
            } else if (num > 0) {
                positiveNumbers[positiveIndex++] = num; // Додатні числа
            }
        }

        arrayPrint(array, "Початковий масив: ");

        arrayPrint(evenNumbers, "Масив парних чисел: ");

        arrayPrint(oddNumbers, "Масив непарних чисел: ");

        arrayPrint(negativeNumbers, "Масив від'ємних чисел: ");

        arrayPrint(positiveNumbers, "Масив додатних чисел: ");
    }

    /**
     *
     * @param array вхідний масив
     * @param sep заголовок виводу
     */
    private static void arrayPrint(int[] array, String sep) {
        System.out.print(sep);
        for (int num : array) {
            System.out.print("| " + num + " ");
        }
        System.out.println("|");
    }
}