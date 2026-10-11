package ru.mirea.lab2.Practika10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = sc.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("Вы ввели 0 слов");
        } else {
            String[] words = text.trim().split("\\s+");
            System.out.println("Вы ввели " + words.length + " слов");
        }

        sc.close();
    }
}
