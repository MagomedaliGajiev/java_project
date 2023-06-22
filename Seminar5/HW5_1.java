package Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * HW5_1
 */
public class HW5_1 {

    // Задание

    // Реализуйте структуру телефонной книги с помощью HashMap.
    // Программа также должна учитывать, что во входной структуре будут
    // повторяющиеся имена с разными телефонами,
    // их необходимо считать, как одного человека с разными телефонами. Вывод должен
    // быть отсортирован по убыванию числа
    // телефонов.

    // Пример меню:
    // 1) Добавить контакт
    // 2) Вывести всех
    // 3) Выход

    // Иванов 123432
    // Иванов 546457
    // Иванов 788354

    // Map<String, ArrayList> ---- {Иванов:[23145, 456745, 56787], Петров:[4325,
    // 45674]}

    public static String firstUpperCase(String word) {
        if (word == null || word.isEmpty())
            return ""; // или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static String getMaxOfMap(Map<String, ArrayList<String>> col) {
        int max = -1;
        String res = "";
        for (var item : col.entrySet()) {
            int cur = item.getValue().size();
            if (cur > max) {
                max = cur;
                res = item.getKey();
            }
        }
        return res;
    }

    public static  Map<String,ArrayList<String>> cloneMap(Map<String,ArrayList<String>> col){
        Map<String,ArrayList<String>> newMap = new HashMap<>();
        for (var item : col.entrySet()) {
            newMap.put(item.getKey(), item.getValue());
        }
        return newMap;
    }

    public static void printDescendingMap(Map<String,ArrayList<String>> col){
        Map<String, ArrayList<String>> temp = new HashMap<>();
                temp = cloneMap(col);
                while (!temp.isEmpty()) {
                    ArrayList<String> list = temp.get(getMaxOfMap(temp));
                    for (String item : list) {
                        System.out.println(getMaxOfMap(temp) + " " + item);
                    }
                    temp.remove(getMaxOfMap(temp));
                }
    }

    public static void main(String[] args) {

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();

        System.out.print("1) Добавить контакт\n2) Вывести всех\n3) Выход\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите желаемое действие: ");
        int enter = Integer.parseInt(sc.nextLine());

        while (enter != 3) {

            if (enter == 1) {
                System.out.print("Введите фамилию: ");
                String surname = firstUpperCase(sc.nextLine());
                System.out.print("Введите  номер телефона: ");
                String phoneNumber = firstUpperCase(sc.nextLine());
                if (!phoneBook.containsKey(surname)) {
                    // String[] strSplit = phoneNumber.split("|||");
                    ArrayList<String> strList = new ArrayList<String>();
                    strList.add(phoneNumber);
                    phoneBook.put(surname, strList);
                    System.out.print("Введите желаемое действие: ");
                    enter = Integer.parseInt(sc.nextLine());
                } else {
                    ArrayList<String> strList = new ArrayList<String>(phoneBook.get(surname));
                    strList.add(phoneNumber);
                    phoneBook.put(surname, strList);
                    System.out.print("Введите желаемое действие: ");
                    enter = Integer.parseInt(sc.nextLine());
                }
            } else if (enter == 2) {
                printDescendingMap(phoneBook);
                System.out.print("Введите желаемое действие: ");
                enter = Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("Такого действия нет!");
                System.out.print("Введите желаемое действие: ");
                enter = Integer.parseInt(sc.nextLine());
            }
        }
        sc.close();
    }
}