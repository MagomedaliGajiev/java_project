package Seminar5;
// Написать программу, определяющую правильность расстановки скобок в выражении.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь


// <({[]})> --- истина
/**
 * Task5_3
 */
public class Task5_3 {


    public static boolean comparesmentMap(String input) {
        char[] symbols = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        for (Character item : symbols) {
            if (map.containsValue(item)) {
                stack.push(item);
            }
            if (map.containsKey(item)) {
                if (stack.empty() || stack.pop() != map.get(item)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(comparesmentMap(input));
        
    }
}