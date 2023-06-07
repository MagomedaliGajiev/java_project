/**
    Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */
public class Task1 {

    public static void main(String[] args) {
        
        int[] array = new int[] {1,1,0,1,1,1};
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                cnt++;
            }
            else {
                if (cnt > max) max = cnt;
                cnt = 0;
            }
        }
        if (cnt > max) max = cnt;

        System.out.println(max);
        

    }
}