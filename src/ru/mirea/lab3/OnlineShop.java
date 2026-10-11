package ru.mirea.lab3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите название товара: ");
        String name = sc.nextLine();

        System.out.print("Введите цену товара в рублях: ");
        double priceRub = sc.nextDouble();

        System.out.println("Выберите валюту для оплаты:");
        System.out.println("1 - Рубли (RUB)");
        System.out.println("2 - Доллары (USD)");
        System.out.println("3 - Евро (EUR)");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();

        double rate = 1.0;
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));

        if (choice == 1) {
            rate = 1.0;
            format = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        } else if (choice == 2) {
            rate = 100.0;
            format = NumberFormat.getCurrencyInstance(Locale.US);
        } else if (choice == 3) {
            rate = 110.0;
            format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        } else {
            System.out.println("Неверный выбор!");
            sc.close();
            return;
        }

        double result = priceRub / rate;

        System.out.println("Товар: " + name);
        System.out.println("Стоимость к оплате: " + format.format(result));

        sc.close();
    }
}