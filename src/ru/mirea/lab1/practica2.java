package ru.mirea.lab1;
import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент a[" + i + "]:");
            a[i] = sc.nextInt();
        }
            int j = 0;
            int sum1 = 0;
            do {
                sum1 += a[j];
                j++;
            } while (j < a.length);
            System.out.println("Сумма элементов массива с помощью do while:" + sum1);
            int k=0;
            int sum2=0;
            while(k<a.length){
                sum2+=a[k];
                k++;
            }
            System.out.println("Сумма элементов массива с помощью while:" + sum2);
            int min_val=a[0];
            int max_val=a[0];
            for(int i=0; i<n;i++){
                if (min_val>a[i]){
                    min_val=a[i];
                }
                if(max_val<a[i]){
                    max_val=a[i];
                }
            }
System.out.println("Минимальный элемент массива:" + min_val);
        System.out.println("Максимальный  элемент массива:" + max_val);
    }
    }
