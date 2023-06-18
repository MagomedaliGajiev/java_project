import java.util.LinkedList;
import java.util.Scanner;

/**
 * Task4_2
 */
public class Task4_2 {
    // Реализовать консольное приложение, которое:

    // 1. Принимает от пользователя строку вида

    // text

    // 1. Нужно сохранить text в связный список.
    // 2. Если введено print~num, выводит строку из позиции num в связном списке и
    // удаляет её из списка.
    // 3. Выход из программы - exit

    // qwe
    // [qwe]
    // tre
    // [qwe, tre]
    // zxc
    // [qwe, tre, zxc]
    // print~1
    // tre
    // [qwe, zxc]
    // print~1
    // zxc
    // [qwe]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string!: ");
        String str = sc.nextLine();
        LinkedList<String> list = new LinkedList<String>();

        while (!str.equals("exit")) {

            if (str.startsWith("print`")) {
                int n = Integer.parseInt(str.split("`")[1]);
                System.out.println(list.remove(n));
            } else {
                list.add(str);
            }
            System.out.println(list);
            System.out.println("Enter your string!: ");
            str = sc.nextLine();

        }
        sc.close();
    }
}