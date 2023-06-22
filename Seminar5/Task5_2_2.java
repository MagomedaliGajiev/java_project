package Seminar5;

import java.util.HashMap;
import java.util.Map;

/**
 * Task5_2_2
 */
public class Task5_2_2 {
    private static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                if (map.containsValue(str2.charAt(i))) {
                    return false;
                }
                map.put(str1.charAt(i), str2.charAt(i));
            } else {
                if (map.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Даны 2 строки, написать метод, который вернет true, если эти строки являются
    // изоморфными и false, если нет.
    // Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
    // букву во втором слове, при этом

    // 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
    // сохранением порядка следования.
    // (Например, add - egg изоморфны)
    // 2. буква может не меняться, а остаться такой же. (Например, note - code) n:c,
    // o:o, t:d, e:e

    // Пример 1:

    // Input: s = "foo", t = "bar", f:b, o:a, --- false

    // Output: false

    // Пример 2:

    // Input: s = "paper", t = "title" p:t, a:i, e:l, r:e,

    // Output: true

    public static void main(String[] args) {

        System.out.println(isIsomorphic("foo", "bar"));

    }
}
