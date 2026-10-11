package ru.mirea.lab4;

enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;
    Size(int euroSize) { this.euroSize = euroSize; }
    public int getEuroSize() { return euroSize; }

    public String getDescription() {
        if (this == XXS) return "Детский размер";
        return "Взрослый размер";
    }
}

// Абстрактная одежда хранит общие поля, но конкретный предмет создаётся наследником.
abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public abstract String getName();

    public String toString() {
        return getName() + ", размер " + size + " (EU " + size.getEuroSize()
                + "), " + size.getDescription() + ", " + color + ", " + price + " руб.";
    }
}

interface MenClothing { void dressMan(); }
interface WomenClothing { void dressWomen(); }

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) { super(size, price, color); }
    public String getName() { return "Футболка"; }
    public void dressMan() { System.out.println("Мужчина: " + this); }
    public void dressWomen() { System.out.println("Женщина: " + this); }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) { super(size, price, color); }
    public String getName() { return "Юбка"; }
    public void dressWomen() { System.out.println("Женщина: " + this); }
}

public class Abstractclass {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "синяя"),
                new Skirt(Size.S, 2400, "чёрная")
        };

        System.out.println("Вся одежда:");
        for (Clothes item : clothes) System.out.println(item);
        System.out.println("\nОдежда для женщины:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) ((WomenClothing) item).dressWomen();
        }
        System.out.println("\nОдежда для мужчины:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) ((MenClothing) item).dressMan();
        }
    }
}