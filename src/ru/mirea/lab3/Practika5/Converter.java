package ru.mirea.lab3.Practika5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму в рублях: ");
        double rub = sc.nextDouble();

        System.out.print("Введите курс рубля к доллару: ");
        double rate = sc.nextDouble();

        double usd = rub / rate;

        NumberFormat rubFormat = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("Сумма в рублях: " + rubFormat.format(rub));
        System.out.println("Сумма в долларах: " + usdFormat.format(usd));

        sc.close();
    }
}