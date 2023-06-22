package Seminar5;

import java.util.HashMap;
import java.util.Map;

/**
 * Task5_1_1
 */
public class Task5_1_1 {
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
        Map<Integer,String> id = new HashMap<>();
        id.put(123456, "Ivanov");
        id.put(321456, "Vasilyev");
        id.put(234561, "Petrova");
        id.put(234432, "Ivanov");
        id.put(654321, "Petrova");
        id.put(345678, "Ivanov");

        for (var item : id.entrySet()) {  
            if (item.getValue().equals("Ivanov")) {
                System.out.printf("%d: %s \n", item.getKey(), item.getValue());
            }
        }
    }
}
