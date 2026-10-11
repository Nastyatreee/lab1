package ru.mirea.lab3.Practika2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }
    public void setCenter(Point center) { this.center = center; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return " центр = " + center.toString() + ", радиус = " + radius;
    }
}
