package Lection6;

import java.util.Arrays;
import java.util.HashSet;

public class Ex001_Program {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.firstName = "Magomedali";
        w1.lastName = "Gajiev";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Nyurzhanat";
        w2.lastName = "Gajieva";
        w2.salary = 70;
        w2.id = 1001;

        Worker w3 = new Worker();
        w3.firstName = "Kamilla";
        w3.lastName = "Gajieva";
        w3.salary = 0;
        w3.id = 1002;

        Worker w4 = new Worker();
        w4.firstName = "Diana";
        w4.lastName = "Gajieva";
        w4.salary = 0;
        w4.id = 1003;

        Worker w5 = new Worker();
        w5.firstName = "Amal";
        w5.lastName = "Gajieva";
        w5.salary = 0;
        w5.id = 1004;

        Worker w6 = new Worker();
        w6.firstName = "Magomedali";
        w6.lastName = "Gajiev";
        w6.salary = 100;
        w6.id = 1000;

        System.out.println(w1 == w6);
        System.out.println(w1.equals(w6));
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
        System.out.println(workers.contains(w6));

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w6);
    }
}
