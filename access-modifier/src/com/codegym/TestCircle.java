package com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(32);
        System.out.println("Rad = " + myCircle.getRadius());
        System.out.printf("Area = %1$,.2f", myCircle.getArea());
    }
}
