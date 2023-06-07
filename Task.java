/**
 * Task
 */

 import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // System.out.println(name);
        // System.out.print(1);
        System.out.print(name);
        sc.close();
    }
}