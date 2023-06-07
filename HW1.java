
/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangle += i;
            factorial *= i;
        }

 

        System.out.printf("Triangle of %d is %d: \n", n, triangle);
        System.out.printf("Factorial of %d is %d: \n", n, factorial);
        // System.out.println(GetTriangle(n)); Можно получить рекурсией.
        // System.out.println(GetFactorial(n)); Можно получить рекурсией.

        sc.close();
    }

    public static int GetTriangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + GetTriangle(n - 1));
        }
    }


    public static int GetFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * GetFactorial(n - 1));
        }
    }

}
