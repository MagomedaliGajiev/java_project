import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Task6_1
 */
public class Task6_1 {

    // 1. Напишите метод, который заполнит массив из 99 элементов случайными цифрами
    // от 0 до 50.

    // 2. Создайте метод, в который передайте заполненный выше массив и с помощью
    // Set вычислите процент уникальных значений
    // в данном массиве и верните его в виде числа с плавающей запятой.

    // Для вычисления процента используйте формулу:

    // процент уникальных чисел = количество уникальных чисел * 100 / общее
    // количество чисел в массиве.

    public static Integer[] fillArray(int size) {
        Random rand = new Random();
        Integer[] resArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            resArray[i] = rand.nextInt(51);
        }
        return resArray;
    }

    public static Set<Integer> getSetfromArr(Integer[] myArray) {
        Set<Integer> mySet = new HashSet<>();
        mySet.addAll(Arrays.asList(myArray));
        return mySet;
    }

    public static float getPercentageOfUniqueValues(Integer[] col) {
        return (float) getSetfromArr(col).size() * 100 / col.length;
    }

    public static void printArray(Integer[] col) {
        for (int i = 0; i < col.length; i++) {
            System.out.print(col[i]);
            if (i != col.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] arr = fillArray(99);
        float res = getPercentageOfUniqueValues(arr);

        System.out.printf("%.2f", res);

    }
}