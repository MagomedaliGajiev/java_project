package Seminar4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        String num1 = "";
        String num2 = "";

        Deque<Character> deque1 = new LinkedList<Character>();
        deque1.add('3');
        deque1.add('2');
        deque1.add('1');
        deque1.add('-');
        int n = deque1.size();
        for (int i = 0; i < n; i++) {
            num1 += deque1.pollLast();
        }

        Deque<Character> deque2 = new LinkedList<Character>();
        deque2.add('5');
        deque2.add('4');
        deque2.add('3');

        n = deque2.size();
        for (int i = 0; i < n; i++) {
            num2 += deque2.pollLast();
        }

        System.out.println(num1);

        
        System.out.println(num2);

        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}