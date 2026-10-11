package ru.mirea.lab4;
class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this("не указан", "не указана", 0);
    }

    public String getNumber() { return number; }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ", номер: " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено на номера:");
        for (String item : numbers) System.out.println(item);
    }

    public void printInfo() {
        System.out.println("Номер: " + number + ", модель: " + model + ", вес: " + weight);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Phone first = new Phone("111-42-33", "Модель A", 150);
        Phone second = new Phone("222-33-44", "Модель B");
        Phone third = new Phone();

        first.printInfo();
        second.printInfo();
        third.printInfo();
        first.receiveCall("Даша");
        second.receiveCall("Максим", "555-67-77");
        System.out.println("Номер первого телефона: " + first.getNumber());
        first.sendMessage("111-42-33", "222-33-44");
    }
}
