package ru.mirea.lab2.Practika6;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(7.0);
        Circle1 c2 = new Circle1(9.0);

        System.out.println(c1.toString());
        System.out.println("Длина: " + c1.getLength());
        System.out.println("Площадь: " + c1.getArea());
        System.out.println("Равны? " + c1.isEqual(c2));
    }
}
