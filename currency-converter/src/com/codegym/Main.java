package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your USD amount:");
        float usd = scanner.nextFloat();
        float exchangeRate = 22869.5f;
        float vnd = usd * exchangeRate;
        System.out.println("It's equivalent to: " + vnd + "vnd");
    }
}
