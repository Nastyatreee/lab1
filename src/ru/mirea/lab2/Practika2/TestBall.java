package ru.mirea.lab2.Practika2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.8, 3.5);
        System.out.println("Начало: " + b1.toString());

        b1.move(3.0, 4.0);
        System.out.println("После move: " + b1.toString());

        b1.setXY(10.0, 20.0);
        System.out.println("После setXY: " + b1.toString());
    }
}
