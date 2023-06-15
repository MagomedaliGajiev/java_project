package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstration2
 */
public class Demonstration2 {

    // Создать список типа ArrayList. Поместить в него как строки, так и целые цисла.
    // Пройти по списку, найти и удалить целые числа

    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>(Arrays.asList("Earth",12,  "Earth",3, 4, "Earth",69, "Earth"));
        for (int i = myList.size() - 1 ; i >= 0; --i) {
            if (myList.get(i) instanceof Integer) {
                myList.remove(i);
            }
        }

        System.out.println(myList);
    }
}