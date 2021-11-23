package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {

        // Second
        Scanner scanner = new Scanner(System.in);
        int first, second;
        System.out.print("Введите первое число: ");
        first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        second = scanner.nextInt();

        int computer1, computer2;
        computer1 = (int)(1 + Math.random() * 6);
        computer2 = (int)(1 + Math.random() * 6);

        if ((first + second) == (computer1 + computer2)) {
            System.out.println("Ничья");
        } else if ((first + second) > (computer1 + computer2)) {
            System.out.println("Победа");
        } else {
            System.out.println("Проигрыш");
        }

        // Third
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String temp = reader.readLine();

        try
        {
            int number = Integer.parseInt(temp);
            if(number > 0)
            {
                System.out.println("Число больше нуля");
            }else
            if(number < 0)
            {
                System.out.println("Число меньше нуля");
            }
            else
            {
                System.out.println("Число равняеся нулю");
            }
        }
        catch(Exception e)
        {
            System.out.println("Введенная строка не является числом");
        }
    }
}
