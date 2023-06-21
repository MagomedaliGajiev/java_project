package Seminar5;

import java.util.HashMap;
import java.util.Map;

/**
 * Task5_1
 */
public class Task5_1 {

    // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
    // организации.

    // 123456 Иванов

    // 321456 Васильев

    // 234561 Петрова

    // 234432 Иванов

    // 654321 Петрова

    // 345678 Иванов

    // Вывести данные по сотрудникам с фамилией Иванов.

    public static void main(String[] args) {
        Map<Integer, String> stId = new HashMap<>();
        stId.put(123456 , "Иванов");
        stId.put(321456, "Васильев");
        stId.put(234561, "Петрова");
        stId.put(234432, "Иванов");
        stId.put(654321, "Петрова");
        stId.put(345678, "Иванов");
        for (var item : stId.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("%d: %s \n", item.getKey(), item.getValue());
            }
        }  

    }

}