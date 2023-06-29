package Seminar6.HomeWork6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет ноутбуки, отвечающие фильтру.
 * NoteBook notebook1 = new NoteBook
 * NoteBook notebook2 = new NoteBook
 * NoteBook notebook3 = new NoteBook
 * NoteBook notebook4 = new NoteBook
 * NoteBook notebook5 = new NoteBook
 * 
 * Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * 
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 * 
 * Класс сделать в отдельном файле
 * 
 * приветствие
 * Выбор параметра
 * выбор конкретнее
 * вывод подходящих
 */
public class HW6 {

    public static String firstUpperCase(String word) {
        if (word == null || word.isEmpty())
            return ""; // или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notebook notebook1 = new Notebook("Asus", "Ryzen", "Black");
        notebook1.setOs("Windows");
        notebook1.setRam(16);
        notebook1.setHdd(500);

        Notebook notebook2 = new Notebook("Lenovo", "Intel", "White");
        notebook2.setOs("Windows");
        notebook2.setRam(32);
        notebook2.setHdd(2000);

        Notebook notebook3 = new Notebook("Redmi", "Ryzen", "Grey");
        notebook3.setOs("Windows");
        notebook3.setRam(16);
        notebook3.setHdd(500);

        Notebook notebook4 = new Notebook("Apple", "Intel", "White");
        notebook4.setOs("MacOs");
        notebook4.setRam(32);
        notebook4.setHdd(2000);

        Notebook notebook5 = new Notebook("Apple", "Ryzen", "Red");
        notebook5.setOs("MacOs");
        notebook5.setRam(16);
        notebook5.setHdd(1000);

        Notebook notebook6 = new Notebook("Asus", "Intel", "Black");
        notebook6.setOs("Ubuntu");
        notebook6.setRam(32);
        notebook6.setHdd(500);

        HashSet<Notebook> notebooks = new HashSet<>(
                Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6));
        HashSet<Notebook> result = new HashSet<>();
        HashMap<String, Object> filter = new HashMap<>();

        System.out.println("1 - RAM");
        System.out.println("2 - HDD Volume");
        System.out.println("3 - Operating system");
        System.out.println("4 - Color");
        System.out.println("5 - Exit");
        System.out.print("Enter the number that matches the required criteria: ");

        int number = sc.nextInt();
        while (number != 5) {
            if (number == 1) {
                System.out.print("Enter a min RAM: ");
                int param = sc.nextInt();
                filter.put("ram", param);
            }
            if (number == 2) {
                System.out.print("Enter a min volume of HDD: ");
                int param = sc.nextInt();
                filter.put("hdd", param);
            } 
            if (number == 3) {
                System.out.print("Enter OS: ");
                String param = firstUpperCase(sc.next());
                filter.put("os", param);
            } 
            if (number == 4) {
                System.out.print("Enter a color: ");
                String param = firstUpperCase(sc.next());
                filter.put("color", param);
            }

            System.out.println("1 - RAM");
            System.out.println("2 - HDD Volume");
            System.out.println("3 - Operating system");
            System.out.println("4 - Color");
            System.out.println("5 - Exit");
            System.out.print("Enter the number that matches the required criteria: ");

            number = sc.nextInt();
        }

        for (var item : filter.entrySet()) {
            if (item.getKey().equals("ram")) {
                Iterator it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook note = (Notebook) it.next();
                    if (note.getRam() >= (int) item.getValue()) {
                        result.add(note);
                    }
                }
            }
            if (item.getKey().equals("hdd")) {
                Iterator it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook note = (Notebook) it.next();
                    if (note.getHdd() >= (int) item.getValue()) {
                        result.add(note);
                    }
                }
            }
            if (item.getKey().equals("color")) {
                Iterator it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook note = (Notebook) it.next();
                    if (note.getColor().equals(item.getValue())) {
                        result.add(note);
                    }
                }
            }
            if (item.getKey().equals("os")) {
                Iterator it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook note = (Notebook) it.next();
                    if (note.getOs().equals(item.getValue())) {
                        result.add(note);
                    }
                }
            }
        }

        for (Notebook notebook : result) {
            System.out.println(notebook);
        }

    }
}