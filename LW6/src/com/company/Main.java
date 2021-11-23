package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        // Second
        for(double i = -1; i <= 1; i += 0.2)
        {
            System.out.println("y = " + (Math.sin(i) + Math.tan(i)));
        }

        // Third
        Scanner scanner = new Scanner(System.in);
        double temp;
        double sum = 0;
        int count = 0;

        while(true)
        {
            System.out.print("Введите число: ");
            temp = scanner.nextDouble();

            if (temp > 0)
                sum += temp;
            else if (temp < 0)
                count += 1;
            else
            {
                System.out.println("Сумма положительных чисел: " + sum + "\nКол-во отрицательных чисел: " + count);
                break;
            }
        }
        // Fourth
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите слово: ");
        String word = reader.readLine();
        char[] tempArr = word.toCharArray();
        count = 0;

        for(char i : tempArr)
        {
            if(String.valueOf(i).equals(String.valueOf(i).toUpperCase(Locale.ROOT)))
            {
                count += 1;
            }
        }


        System.out.println("В строке " + count + " больших букв");
    }
}
