package ru.mirea.lab3.Practika4;

import java.util.Random;
import java.util.Scanner;

public class Filtration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = 0;

        while (n <= 0) {
            System.out.print("Введите размер массива (n > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Число должно быть больше 0!");
                }
            } else {
                System.out.println("Это не целое число!");
                sc.next();
            }
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1); // [0; n]
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount = evenCount + 1;
            }
        }

        if (evenCount == 0) {
            System.out.println("Чётных элементов нет");
        } else {
            int[] evenArr = new int[evenCount];
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[k] = arr[i];
                    k = k + 1;
                }
            }

            System.out.print("Массив чётных: ");
            for (int i = 0; i < evenArr.length; i++) {
                System.out.print(evenArr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}