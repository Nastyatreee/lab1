package ru.mirea.lab3.Practika1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        double[] arr1 = new double[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random() * 100;
        }
        System.out.println("Массив 1 (Math.random) до сортировки:");
        for (double v : arr1) System.out.printf("%.2f ", v);
        Arrays.sort(arr1);
        System.out.println("\nМассив 1 после сортировки:");
        for (double v : arr1) System.out.printf("%.2f ", v);


        Random rand = new Random();
        double[] arr2 = new double[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextDouble() * 100;
        }
        System.out.println("\n\nМассив 2 (Random) до сортировки:");
        for (double v : arr2) System.out.printf("%.2f ", v);
        Arrays.sort(arr2);
        System.out.println("\nМассив 2 после сортировки:");
        for (double v : arr2) System.out.printf("%.2f ", v);
    }
}