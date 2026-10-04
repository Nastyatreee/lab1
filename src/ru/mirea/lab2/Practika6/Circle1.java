package ru.mirea.lab2.Practika6;

public class Circle1 {
    private double radius;

    public Circle1 (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean isEqual(Circle1 other) {
        return this.radius == other.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
