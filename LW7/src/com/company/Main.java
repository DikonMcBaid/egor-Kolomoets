package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Second
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0 + (int)(Math.random() * 6);
        }

        int first = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1])
                first = arr[i];
        }

        int second = 0;
        for (int i : arr) {
            second += i;
        }
        second /= arr.length;

        System.out.println("Наибольший из элементов: " + first + "\nСреднее значение: " + second);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Число точек: ");
        int NumberPoint = Integer.parseInt(reader.readLine());
        int[][] ArrayPoint = new int[NumberPoint][2];
        for (int i = 0; i < ArrayPoint.length; i++) {
            for (int j = 0; j < ArrayPoint[i].length; j++) {
                ArrayPoint[i][j] = (int) (Math.random() * 240 - 120);
            }
        }
        System.out.println("Массив: ");
        for (int[] elemRow : ArrayPoint) {
            for (int elemColumn : elemRow) {
                System.out.print(elemColumn + "\t");
            }
            System.out.println();
        }
        int iter = 0, NumericPointInTwoPartsSquare = 0;
        while (iter < ArrayPoint.length) {
            if (ArrayPoint[iter][0] < 0 && ArrayPoint[iter][1] > 0) NumericPointInTwoPartsSquare++;
            iter++;
        }
        System.out.println("Число точек на второй части координатной плоскости: " + NumericPointInTwoPartsSquare);
    }
}