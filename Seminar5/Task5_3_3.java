package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Task5_3_3
 */
public class Task5_3_3 {
    // Написать программу, определяющую правильность расстановки скобок в выражении.

    // Пример 1: a+(d*3) - истина

    // Пример 2: [a+(1*3) - ложь

    // Пример 3: [6+(3*3)] - истина

    // Пример 4: {a}[+]{(d*3)} - истина

    // Пример 5: <{a}+{(d*3)}> - истина

    // Пример 6: {a+]}{(d*3)} - ложь

    // <({[]})> --- истина

    public static boolean checkBrackets(String input){
        char[] symbols = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');

        for (int i = 0; i < symbols.length; i++) {
            if (map.containsValue(symbols[i])) {
                stack.push(symbols[i]);
            }
            if (map.containsKey(symbols[i])) {
                if (stack.empty() || stack.pop() != map.get(symbols[i])) {
                    return false;
                }
            }
        }
        return stack.empty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(checkBrackets(str));
        sc.close();
    }
}