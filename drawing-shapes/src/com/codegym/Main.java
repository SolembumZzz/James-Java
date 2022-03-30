package com.codegym;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 4) {
            System.out.printf("Menu:\n" +
                    "\n" +
                    "    1. Print the rectangle\n" +
                    "\n" +
                    "    2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "\n" +
                    "    3. Print isosceles triangle\n" +
                    "\n" +
                    "    4. Exit\n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++, System.out.printf("\n")) {
                        for (int j = 0; j < 7; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 2:
                    for (int i = 0, k = 4; i < 5; i++, k--, System.out.printf("\n")) {
                        for (int j = 0; j <= k; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    for (int i = 0, k = 4; i < 5; i++, k--, System.out.printf("\n")) {
                        for (int m = 0; m < i; m++) {
                            System.out.printf("  ");
                        }
                        for (int j = 0; j <= k; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    for (int i = 0, k = 0; i < 5; i++, k++, System.out.printf("\n")) {
                        for (int j = 0; j <= k; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    for (int i = 0, m = 5; i < 6; i++, m--, System.out.printf("\n")) {
                        for (int k = 0; k < m; k++) {
                            System.out.printf("  ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    for (int i = 0, k = 1, l = 5; i < 5; i++, k += 2, l--, System.out.printf("\n")) {
                        for (int m = 0; m < l; m++) {
                            System.out.printf("  ");
                        }
                        for (int j = 0; j < k; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                    break;
                default:
                    System.out.printf("Wrong command.");
                    System.out.printf("\n");
                    break;
            }
        }
    }
}

