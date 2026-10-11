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
    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }
    public void moveUp() { y += ySpeed; }
    public void moveDown() { y -= ySpeed; }
    public void moveLeft() { x -= xSpeed; }
    public void moveRight() { x += xSpeed; }
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    public void moveUp() { if (speedTest()) { topLeft.moveUp(); bottomRight.moveUp(); } }
    public void moveDown() { if (speedTest()) { topLeft.moveDown(); bottomRight.moveDown(); } }
    public void moveLeft() { if (speedTest()) { topLeft.moveLeft(); bottomRight.moveLeft(); } }
    public void moveRight() { if (speedTest()) { topLeft.moveRight(); bottomRight.moveRight(); } }

    public String toString() { return "Верхняя левая: " + topLeft + "; нижняя правая: " + bottomRight; }
}

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 4, 6, 0, 1, 2);
        System.out.println("Скорости точек совпадают: " + rectangle.speedTest());
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println("После перемещения влево: " + rectangle);
    }
}