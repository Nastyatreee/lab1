package ru.mirea.lab2.Practika8;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        System.out.println("Было: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Стало: " + Arrays.toString(arr));
    }
}
