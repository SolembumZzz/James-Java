package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("The first 20 prime numbers: ");
        for (int num = 2; num < 100; num++) {
            boolean flag = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.printf(num + ", ");
            }
        }
    }
}
