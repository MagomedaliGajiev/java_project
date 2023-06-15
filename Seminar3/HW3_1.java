package Seminar3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * HW3_1
 */
public class HW3_1 {

    // Пусть дан произвольный список целых чисел.

    // 1) Нужно удалить из него чётные числа
    // 2) Найти минимальное значение
    // 3) Найти максимальное значение
    // 4) Найти среднее ариф. значение

    public static void remEvenNumbers(ArrayList<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i % 2 == 0) {
                iter.remove();
            }
        }
    }

    public static int getMin(ArrayList<Integer> list) {
        int min = list.get(0);

        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int getMax(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static double getAvg(ArrayList<Integer> list) {
        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
            ++cnt;
        }
        return sum / cnt;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
        Random rand = new Random();

        for (int i = 0; i < listNumbers.size(); ++i) {
            listNumbers.set(i, rand.nextInt(100));

        }

        System.out.println(listNumbers);
        System.out.println("Min value of our list is: " + getMin(listNumbers));
        System.out.println("Max value of our list is: " + getMax(listNumbers));
        System.out.println("Average value of our list is: " + getAvg(listNumbers));
        remEvenNumbers(listNumbers);
        System.out.println(listNumbers);
    }
}
