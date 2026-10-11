package ru.mirea.lab3.Practika3;
import java.util.Random;

public class Working {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + rand.nextInt(90); // [10; 99]
        }

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean increasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
