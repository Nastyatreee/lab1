package ru.mirea.lab4;

enum ComputerBrand {
    ACER, ASUS, DELL, LENOVO
}

class Processor {
    private String model;
    public Processor(String model) { this.model = model; }
    public String toString() { return model; }
}

class Memory {
    private int gigabytes;
    public Memory(int gigabytes) { this.gigabytes = gigabytes; }
    public String toString() { return gigabytes + " ГБ"; }
}

class Monitor {
    private double inches;
    public Monitor(double inches) { this.inches = inches; }
    public String toString() { return inches + " дюйма"; }
}

class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void printInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Процессор: " + processor);
        System.out.println("Память: " + memory);
        System.out.println("Монитор: " + monitor);
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(ComputerBrand.LENOVO,
                new Processor("Intel Core i5"), new Memory(16), new Monitor(15.6));
        computer.printInfo();
    }
}
