package com.company;

import javax.naming.CompositeName;
import java.util.Locale;
import java.util.logging.ConsoleHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(Character.toString(0x1F615) + Character.toString(0x1F62B) + Character.toString(0x1F631));

        String second = "Вівторок, 15 Березня 2020";
        String[] temp = second.split(" ");
        boolean answer = temp[3].equals("2021");

        System.out.println(answer);
    }
}
