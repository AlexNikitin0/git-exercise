package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Hello " + name + "!");
    }
}