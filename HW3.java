/**
 * Реализовать простой калькулятор (+-/*)
 */

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter an operation: ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        switch (op) {
            case "+":
                System.out.printf("%d %s %d = %d", number1, op, number2, number1 + number2);
                break;
            case "-":
                System.out.printf("%d %s %d = %d", number1, op, number2, number1 - number2);
                break;
            case "/":
                System.out.printf("%d %s %d = %d", number1, op, number2, number1 / number2);
                break;
            case "*":
                System.out.printf("%d %s %d = %d", number1, op, number2, number1 * number2);
                break;


            default:
                System.out.println("Such operation is not included");
                break;
        }

    }
}