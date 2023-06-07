/**
 * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить, что его нет.
 * Под знаком вопроса - всегда одинаковая ЦИФРА.
 * Введите уравнение: ?? + ?? = 44
 * Решение: 22 + 22 = 44
 */

 import java.util.Scanner;


public class HW4 {
    public static String getSolve(String str1, String str2, String str3) {
        for (int i = 0; i < 10; ++i){
            char iChar = Integer.toString(i).charAt(0);
            String newStr1 = str1.replace('?', iChar);
            String newStr2 = str2.replace('?', iChar);
            if (Integer.parseInt(newStr1) + Integer.parseInt(newStr2) == Integer.parseInt(str3)){
                return newStr1 + " + " + newStr2 + " = " + str3;
            }
        }
        return "Нет решения";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String expression = sc.nextLine();
        String[] nums = expression.split("\\s*[\\+\\=]\\s*"); // Любое количество пробелов, затем + или =, затем любое количество пробелов
        System.out.print("Решение: " + getSolve(nums[0], nums[1], nums[2]));
        sc.close();
    }
}
