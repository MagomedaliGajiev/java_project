
/**
 * 4) К калькулятору из предыдущего ДЗ добавить логирование.
3+4=7
1+2=3
6/3=2
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HW8 {

    public static void main(String[] args) throws SecurityException, IOException {

        Logger lg = Logger.getLogger(HW8.class.getName());
        String logPath = "log.txt";
        lg.setLevel(Level.INFO);
        FileHandler fh = new FileHandler(logPath, false);
        lg.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int number1 = sc.nextInt();

            System.out.print("Enter an operation: ");
            String op = sc.next();
            if (op.equals("exit")) {
                break;
            }

            System.out.print("Enter second number: ");
            int number2 = sc.nextInt();

            switch (op) {
                case "+":
                    System.out.printf("%d %s %d = %d", number1, op, number2, number1 + number2);
                    lg.log(Level.INFO,
                            String.format("Решение: %d %s %d = %d", number1, op, number2, number1 + number2));
                    break;
                case "-":
                    System.out.printf("%d %s %d = %d", number1, op, number2, number1 - number2);
                    lg.log(Level.INFO,
                            String.format("Решение: %d %s %d = %d", number1, op, number2, number1 - number2));
                    break;
                case "/":
                    System.out.printf("%d %s %d = %d", number1, op, number2, number1 / number2);
                    lg.log(Level.INFO,
                            String.format("Решение: %d %s %d = %d", number1, op, number2, number1 / number2));
                    break;
                case "*":
                    System.out.printf("%d %s %d = %d", number1, op, number2, number1 * number2);
                    lg.log(Level.INFO,
                            String.format("Решение: %d %s %d = %d", number1, op, number2, number1 * number2));
                    break;

                default:
                    System.out.println("Such operation is not included");
                     lg.log(Level.INFO,
                            String.format("Such operation is not included"));
                    break;
            }

        }

    }
}