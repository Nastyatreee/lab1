package ru.mirea.lab2.Practika1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Nastya", "nast0210@mail.ru", 'w');

        System.out.println(a1.toString());

        a1.setEmail("nastya4335@mail.ru");
        System.out.println("Новый email: " + a1.getEmail());
    }
}
