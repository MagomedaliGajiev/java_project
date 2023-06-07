import java.util.Arrays;

/**
 * Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
 * конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного, а остальные - равны ему.
 */
public class Task22 {
    public static void main(String[] args) {

        int[] array = new int[] { 3, 2, 4, 3, 3, 1, 5, 3, 3 };
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 3) {
                array[cnt++] = array[i];
            }

            for (int j = cnt; j < array.length; j++) {
                array[i] = 3;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}