interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x; this.y = y; this.xSpeed = xSpeed; this.ySpeed = ySpeed;
    }
    public void moveUp() { y += ySpeed; }
    public void moveDown() { y -= ySpeed; }
    public void moveLeft() { x -= xSpeed; }
    public void moveRight() { x += xSpeed; }
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }
    public String toString() { return "Центр " + center + ", радиус " + radius; }
}

public class Main {
    public static void main(String[] args) {
        Movable[] objects = {new MovablePoint(1, 1, 2, 1), new MovableCircle(5, 5, 1, 1, 3)};
        for (Movable object : objects) {
            System.out.println("До: " + object);
            object.moveUp();
            object.moveRight();
            System.out.println("После движения вверх и вправо: " + object);
        }
    }
}