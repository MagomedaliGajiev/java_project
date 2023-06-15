package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstration3
 */
public class Demonstration3 {

    // Создать список типа ArrayList. Поместить в него как строки, так и целые
    // числа.
    // Пройти по списку, найти и удалить целые числа
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>(Arrays.asList("Earth", 12, "Earth", 3, 4, "Earth", 69, "Earth"));
        Iterator iter = myList.iterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof Integer) {
                iter.remove();
            }
        }
    }
}