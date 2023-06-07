/**
 * Вывести все простые числа от 1 до 1000
 */
public class HW2 {

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean simpleNum = true;

            for (int j = 2; j * j <= i; j++) {
                simpleNum = (i % j != 0);
                if (!simpleNum) {
                    break;
                }
            }
            if (simpleNum) {
                System.out.print(i + " ");
            }
        }
    }
}