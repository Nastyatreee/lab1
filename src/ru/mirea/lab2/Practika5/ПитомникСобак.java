package ru.mirea.lab2.Practika5;

public class ПитомникСобак {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Дублер", 12);
        dogs[1] = new Dog("Уголек", 7);
        dogs[2] = new Dog("Тайсон", 1);

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].toString() + " - человеческий возраст: " + dogs[i].getHumanAge());
        }
    }
}
