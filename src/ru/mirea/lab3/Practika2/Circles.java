package ru.mirea.lab3.Practika2;
import java.util.Random;

public class Circles {
    public static void main(String[] args) {
        Random rand = new Random();
        Tester tester = new Tester(5);


        for (int i = 0; i < 5; i++) {
            Point p = new Point(rand.nextInt(10), rand.nextInt(10));
            double r = 1 + rand.nextDouble() * 9;
            tester.addCircle(new Circle(p, r));
        }

        System.out.println("Все окружности:");
        tester.printAll();

        System.out.println();
        System.out.println("Самая маленькая: " + tester.findSmallest().toString());
        System.out.println("Самая большая: " + tester.findLargest().toString());

        tester.sortByRadius();
        System.out.println();
        System.out.println("После сортировки по радиусу:");
        tester.printAll();
    }
}
