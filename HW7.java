
/**
 * 3) Дана строка в файле(читать из файла)
 * [{"name":"Ivanov","score":"5","subject":"Math"},{"name":"Petrova","score":"4","subject":"ComputerScience"},{"name":"Krasnov","score":"5","subject":"Physics"}]
 * Написать метод(ы), который распарсит строчку и, используя StringBuilder,
 * создаст строки вида: Студент [name] получил [score] по предмету
 * [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */

import java.util.HashMap;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class HW7 {
    public static ArrayList<HashMap<String, String>> parseJson(String jsonString) {
        final String KV_REGEXP = "\\{.+?\\}"; // Регулярка для строк вида "{...}"
        final String OBJ_REGEX = "\"\\w+\":\"\\w+\""; // Регулярка для строк вида "ключ":"значение"

        Pattern objPattern = Pattern.compile(KV_REGEXP);
        Matcher objMatcher = objPattern.matcher(jsonString);

        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        while (objMatcher.find()) {
            String objString = jsonString.substring(objMatcher.start(), objMatcher.end());
            // String group = objMatcher.group(0);

            Pattern kvPattern = Pattern.compile(OBJ_REGEX);
            Matcher kvMatcher = kvPattern.matcher(objString);

            HashMap<String, String> map = new HashMap<String, String>();
            while (kvMatcher.find()) {
                String kvString = objString.substring(kvMatcher.start(), kvMatcher.end());
                String[] kv = kvString.split(":");
                kv[0] = kv[0].substring(1, kv[0].length() - 1); // Избавляемся от кавычек
                kv[1] = kv[1].substring(1, kv[1].length() - 1);
                map.put(kv[0], kv[1]);
            }
            list.add(map);
        }
        return list;
    }

    public static String buildString(ArrayList<HashMap<String, String>> list) {
        StringBuilder string = new StringBuilder();
        for (HashMap<String, String> map : list) { // Для каждого словаря в списке
            string.append("Student ").append(map.get("name")).append(" recieved ").append(map.get("score"))
                    .append(" in the subject of ").append(map.get("subject")).append("\n");
        }
        string.delete(string.length()-1, string.length());
        return string.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter string: ");
        String jsonString = sc.nextLine();

        System.out.println(buildString(parseJson(jsonString)));
        sc.close();
    }
}