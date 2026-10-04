package ru.mirea.lab1;

public class practika1 {
    public static void main(String [] args) {
        int [] a= {2,4,5,6,8,9,10};
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        double mean = (double) sum/a.length;
        System.out.println("Сумма элементов целочисленного массива:" + sum);
        System.out.println("Среднее арифметическое массива:" + mean);
    }
}
