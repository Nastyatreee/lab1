package ru.mirea.lab1;

public class practika5 {
public static void main(String[] args){
    for(int n=1; n<=10; n++){
        System.out.println(n+ "! = "+ factorial(n));

    }
}
    public static long factorial(int n){
long result=1;
for(int i=1; i<=n; i++){
    result*=i;
}
return result;
    }
}
