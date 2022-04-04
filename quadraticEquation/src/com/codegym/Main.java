package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation:");
        System.out.printf("Input a: ");
        double a = input.nextDouble();
        System.out.printf("Input b: ");
        double b = input.nextDouble();
        System.out.printf("Input c: ");
        double c = input.nextDouble();

        Quadraticequation myMath = new Quadraticequation(a, b, c);
        System.out.println(myMath.calculate());
    }
}
