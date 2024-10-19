package itstep.less2.dz;

public class dz11 {
    public static void main(String[] args) {

        drawLine(4, 'v', '#');  // вертикальна лінія з символів '#'
        drawLine(5, 'h', '*');  // горизонтальна лінія з символів '*'
    }

    /**
     * Метод для виведення горизонтальної або вертикальної лінії з певного символа
     * @param length довжина лінії
     * @param direction напрямок ('h' - горизонтальний, 'v' - вертикальний)
     * @param symbol символ для побудови лінії
     */
    public static void drawLine(int length, char direction, char symbol) {
        if (direction == 'h') {
            // Виведення горизонтальної лінії
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'v') {
            // Виведення вертикальної лінії
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Неправильний напрямок. Використовуйте 'h' для горизонтальної або 'v' для вертикальної лінії.");
        }
    }
}
