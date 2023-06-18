// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа

package Seminar4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * HW4_1
 */
public class HW4_1 {

    public static LinkedList<Character> multiplyDeques(Deque<Character> col1, Deque<Character> col2) {
        LinkedList<Character> result = new LinkedList<Character>();
        String num1 = "";
        String num2 = "";
        int n = col1.size();
        for (int i = 0; i < n; i++) {
            num1 += col1.pollLast();
        }

        n = col2.size();
        for (int i = 0; i < n; i++) {
            num2 += col2.pollLast();
        }

        String tempStr = Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2));

        for (int i = 0; i < tempStr.length(); i++) {
            result.add(tempStr.charAt(i));
        }

        return result;
    }

    public static LinkedList<Character> addDeques(Deque<Character> col1, Deque<Character> col2) {
        LinkedList<Character> result = new LinkedList<Character>();
        String num1 = "";
        String num2 = "";
        int n = col1.size();
        for (int i = 0; i < n; i++) {
            num1 += col1.pollLast();
        }

        n = col2.size();
        for (int i = 0; i < n; i++) {
            num2 += col2.pollLast();
        }

        String tempStr = Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));

        for (int i = 0; i < tempStr.length(); i++) {
            result.add(tempStr.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Deque<Character> deque1 = new LinkedList<Character>();
        deque1.add('3');
        deque1.add('2');
        deque1.add('1');
        deque1.add('-');

        Deque<Character> deque2 = new LinkedList<Character>();
        deque2.add('5');
        deque2.add('4');
        deque2.add('3');

        System.out.println(multiplyDeques(deque1, deque2));

        deque1.add('3');
        deque1.add('2');
        deque1.add('1');
        deque1.add('-');

        deque2.add('5');
        deque2.add('4');
        deque2.add('3');

        System.out.println(addDeques(deque1, deque2));

    }
}