import java.io.FileWriter;
import java.util.Random;

/**
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
 * после каждой итерации запишите в лог-файл.
 * 1 3 4 2
 * 1 3 2 4
 * 1 2 3 4
 */
public class HW6 {

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]);

            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
    public static void bubleSort(int[] array) {
        try {
            try (FileWriter writer = new FileWriter("log.txt")) {
                writer.write(arrayToString(array) + "\n");
                for (int i = array.length - 1; i > 0; --i) {
                    boolean flag = false;
                    for (int j = 0; j < i; ++j) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                            flag = true;
                            writer.write(arrayToString(array) + "\n");
                        }
                    }
                    if (!flag) {
                        return;
                    }
                }
                writer.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Что то пошло не так!");
            ;
        }
    }
    public static void main(String[] args) {
        int[] myArray = new int[10];

        Random rand = new Random();

        for (int i = 0; i < myArray.length; ++i) {
            myArray[i] = rand.nextInt(100);
        }
        bubleSort(myArray);
    }
}