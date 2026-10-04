package ru.mirea.lab2.Practika9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Пики", "Черви", "Бубны", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> deck = new ArrayList<String>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(ranks[j] + " " + suits[i]);
            }
        }

        Collections.shuffle(deck);

        System.out.print("Введите число игроков: ");
        int n = sc.nextInt();

        if (n * 5 > 52) {
            System.out.println("Слишком много игроков");
        } else {
            int k = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println("Игрок " + i + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.println("  " + deck.get(k));
                    k = k + 1;
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
