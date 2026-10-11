package ru.mirea.lab3.Practika5;

public class Double1 {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        double d3 = Double.parseDouble("5.55");
        System.out.println("d3 = " + d3);

        Double obj = Double.valueOf(42.99);
        byte b = obj.byteValue();
        short s = obj.shortValue();
        int i = obj.intValue();
        long l = obj.longValue();
        float f = obj.floatValue();
        double d = obj.doubleValue();

        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("Объект Double: " + obj);

        String str = Double.toString(3.14);
        System.out.println("Строка: " + str);
    }
}
