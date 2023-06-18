import java.util.Scanner;
import java.util.Stack;

/**
 * Реализовать консольное приложение, которое:
 * 
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная
 * была первой в списке, а первая - последней и чистит весь перечень.
 * qwe
 * [qwe]
 * tre
 * [qwe, tre]
 * zxc
 * [qwe, tre, zxc]
 * print
 * zxc, tre, qwe
 * []
 */
public class Task4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        Stack<String> list = new Stack<String>();

        try {
            while (!str.equals("exit")) {
                if (str.equals("print")) {
                    while (!list.empty() && list.size() > 1) {
                        System.out.print(list.pop() + ", ");
                    }
                    System.out.print(list.pop() + "\n");
                } else {
                    list.push(str);
                }
                System.out.println(list);
                System.out.print("Enter your string: ");
                str = sc.nextLine();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        sc.close();
    }
}