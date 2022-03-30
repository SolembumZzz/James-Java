package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("The first 20 prime numbers: ");
        int num = 2;
        for (int count = 0; count < 20; num++) {
            boolean flag = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count++;
                System.out.printf(num + ", ");
            }
        }
    }
}
