package ru.mirea.lab3.Practika2;

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


    public Circle findSmallest() {
        Circle min = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < min.getRadius()) {
                min = circles[i];
            }
        }
        return min;
    }

    // Самая большая окружность
    public Circle findLargest() {
        Circle max = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > max.getRadius()) {
                max = circles[i];
            }
        }
        return max;
    }


    public void sortByRadius() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Окружность " + (i + 1) + ": " + circles[i].toString());
            System.out.printf("  Длина = %.2f%n", circles[i].getLength());
        }
    }
}
