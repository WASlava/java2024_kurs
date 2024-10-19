package itstep.less2.dz;

import java.util.Arrays;

public class dz12 {
    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 7, 3, 8};

        sortArray(array, 'a'); // Сортування за зростанням
        System.out.println("Масив за зростанням: " + Arrays.toString(array));

        sortArray(array, 'd'); // Сортування за спаданням
        System.out.println("Масив за спаданням: " + Arrays.toString(array));
    }

    /**
     * Метод сортує масив за зростанням або спаданням
     *
     * @param array масив для сортування
     * @param order 'a' - за зростанням, 'd' - за спаданням
     */
    public static void sortArray(int[] array, char order) {
        if (order == 'a') {
            // Сортування за зростанням
            Arrays.sort(array);
        } else if (order == 'd') {
            // Сортування за спаданням
            Arrays.sort(array);
            reverseArray(array);
        } else {
            System.out.println("Неправильний вибір. Використовуйте 'a' для зростання або 'd' для спадання.");
        }
    }

    /**
     * Метод для зміни порядку елементів масиву на зворотний
     *
     * @param array масив, елементи якого треба перевернути
     */
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

