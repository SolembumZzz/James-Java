package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 sides of the triangle: ");
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        System.out.println("Please enter its appearance: ");
        System.out.print("color = ");
        String color = input.next();
        System.out.print("filled = ");
        boolean filled = input.nextBoolean();

        Triangle myTriangle = new Triangle(a, b, c, color, filled);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getArea());
        System.out.println(myTriangle.getColor());;
        System.out.println(myTriangle.isFilled());;

    }
}
