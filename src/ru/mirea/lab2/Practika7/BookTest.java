package ru.mirea.lab2.Practika7;

public class BookTest {
    public static void main(String[] args) {
        Book[] shelf = new Book[4];

        shelf[0] = new Book("Пушкин", "Онегин", 1833);
        shelf[1] = new Book("Толстой", "Война и мир", 1869);
        shelf[2] = new Book("Достоевский", "Белые ночи", 1848);
        shelf[3] = new Book("Тургенев", "Отцы и дети", 1862);

        Book earliest = shelf[0];
        Book latest = shelf[0];

        for (int i = 1; i < shelf.length; i++) {
            if (shelf[i].getYear() < earliest.getYear()) {
                earliest = shelf[i];
            }
            if (shelf[i].getYear() > latest.getYear()) {
                latest = shelf[i];
            }
        }

        System.out.println("Самая ранняя: " + earliest.toString());
        System.out.println("Самая поздняя: " + latest.toString());

        for (int i = 0; i < shelf.length - 1; i++) {
            for (int j = 0; j < shelf.length - 1 - i; j++) {
                if (shelf[j].getYear() > shelf[j + 1].getYear()) {
                    Book temp = shelf[j];
                    shelf[j] = shelf[j + 1];
                    shelf[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортировано:");
        for (int i = 0; i < shelf.length; i++) {
            System.out.println(shelf[i].toString());
        }
    }
}
