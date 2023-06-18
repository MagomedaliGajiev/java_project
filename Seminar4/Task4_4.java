/**
 * Написать метод, который принимает массив элементов, помещает их в очередь и
 * выводит на консоль содержимое очереди.
 */

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Task4_4
 */
public class Task4_4 {

    public static Queue<Integer> getQueue(int[] array){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-100,100);
        }

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + "\n");
            }
        }
        System.out.println(getQueue(array));
    }
}