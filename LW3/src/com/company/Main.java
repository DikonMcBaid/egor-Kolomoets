package com.company;
public class Main {
    // Метод для выполнения третьего задания
    private static double equation(double d1, double d2, float f1, float f2)
    {
        return 1/f1 - 2/f2 + (Math.sin(d1) / Math.log10(d2));
    }
    public static void main(String[] args)
    {
    // Первое задание
        short s1 = 99, s2 = 99;
        float f1 = 1f, f2 = 2f;
        byte b = -10;
        boolean q = true;
        System.out.println("s1, s2 -> " + s1 + ", " + s2);
        System.out.println("b ->; " + b);
        System.out.println("q ->; " + q);
    // Второе задание
        double d1, d2;
        s1 = (short) Math.pow(b,2);
    // Math.random() * (max - min) + min;
        s2 = (short)(Math.random() * 10);
        d2 = Math.random() * 9998 + 1;
        d1 = d2 / s1 * s2;
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);
        System.out.println("d1 = d2 / s1 * s2 -> " + d1);
        System.out.println("d2 -> " + d2);
    // Третье задание
        double y = equation(d1, d2, f1, f2);
        System.out.println("Результат вычислений: " + y);
    }
}