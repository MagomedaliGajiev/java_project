import java.lang.reflect.Array;

/**
 * Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
 * конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного, а остальные - равны ему.
 */
public class Task2 {

    public static void main(String[] args) {


        int[] arr = new int[] {1,2,4,1,3,1,5,3,1};

        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] == 3) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}