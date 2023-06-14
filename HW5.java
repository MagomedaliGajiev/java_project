/**
 * 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть
 * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
 * ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow",
 * "age":"15"}
 * Вывод: select * from students WHERE name=Ivanov AND country=Russia AND
 * city=Moscow
 */

// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"15"}

//     ""asdasd"":""asdasd"",

import java.util.HashMap;
import java.util.regex.*;
import java.util.Scanner;

public class HW5 {
    public static HashMap<String, String> parseJson(String jsonString) {
        final String REGEXP = "\"\\w+\":\"\\w+\""; // Регулярка для строк вида "ключ":"значение"
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(jsonString);

        HashMap<String, String> map = new HashMap<String, String>();
        while (matcher.find()) {
            String kvString = jsonString.substring(matcher.start(), matcher.end());
            String[] kv = kvString.split(":");
            kv[0] = kv[0].substring(1, kv[0].length() - 1); // Избавляемся от кавычек
            kv[1] = kv[1].substring(1, kv[1].length() - 1);
            map.put(kv[0], kv[1]);
        }
        return map;
    }

    public static String buildRequest(HashMap<String, String> map) {
        StringBuilder request = new StringBuilder("select * from students WHERE ");
        for (HashMap.Entry<String, String> entry : map.entrySet()) { // Для каждой пары (ключ, значение) в словаре
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("null")) {
                continue;
            }
            request.append(key).append('=').append(value).append(" AND ");
        }
        request.delete(request.length() - 5, request.length()); // Избавляемся от лишнего AND в конце (строка " AND ")
        return request.toString();
    }

    public static void main(String[] args) {
        // final String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\",
        // \"city\":\"null\", \"age\":\"15\"}";
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Json string: ");
        String jsonString = sc.nextLine();

        HashMap<String, String> map = parseJson(jsonString);
        System.out.println(buildRequest(map));
    }
}