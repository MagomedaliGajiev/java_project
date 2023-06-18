import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Task4_1
 */
public class Task4_1 {
    // 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

    // 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
    // Сравните с предыдущим.
    public static void main(String[] args) {
        Random rand = new Random();
        long time_start = System.currentTimeMillis();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 100_0000; i++) {
            int val = rand.nextInt(-100, 100);
            list1.add(0,val);
        }
        long time_end = System.currentTimeMillis();

        System.out.println(time_end - time_start);

        long time_start1 = System.currentTimeMillis();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 100_000; i++) {
            int val = rand.nextInt(-100, 100);
            list2.add(0,val);
        }
        long time_end1 = System.currentTimeMillis();

        System.out.println(time_end1 - time_start1);

    }
}