package ru.mirea.lab2.Practika3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count] = c;
            count = count + 1;
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i].toString());
        }
    }

    public static void main(String[] args) {
        Tester t = new Tester(5);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 9);

        t.addCircle(new Circle(p1, 14.0));
        t.addCircle(new Circle(p2, 3.8));

        t.printAll();
    }
}
