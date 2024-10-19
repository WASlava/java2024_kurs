package itstep.less2.dz;
import java.util.Random;

public class dz9 {
    public static void main(String[] args) {

        int[] array = new int[20]; // Масив із 20 елементів
        Random random = new Random();

        int n = random.nextInt(15) + 10; // границя діапазону випадкових чисел

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2*n+1) - n; // Випадкові числа від -n до n
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int num : array) {

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print("| " + num + " ");
        }
        System.out.println("|");

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Кількість від'ємних елементів: " + negativeCount);
        System.out.println("Кількість додатних елементів: " + positiveCount);
        System.out.println("Кількість нулів: " + zeroCount);
    }
}
