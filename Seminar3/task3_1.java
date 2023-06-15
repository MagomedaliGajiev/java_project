package Seminar3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном
 * порядке с повторениями. Вывести название каждой планеты и количество его
 * повторений в списке.
 * earth, earth, mars, saturn, neptun, earth
 */
public class task3_1 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        final List<String> PLANETS = Arrays.asList("earth", "mars", "venera", "jupyter", "saturn", "neptun", "uran",
                "mercury");
        List<Integer> numbers = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] planets = input.split("\\s*,\\s*");
        for (String planet : planets) {
            int idx = PLANETS.indexOf(planet.toLowerCase());
            if (idx != -1) {
                numbers.set(idx, numbers.get(idx) + 1);
            }
        }
        for (int i = 0; i < PLANETS.size(); ++i) {
            if (numbers.get(i) > 0) {
                System.out.println(PLANETS.get(i) + ": " + numbers.get(i));
            }
        }
        sc.close();
    }
}