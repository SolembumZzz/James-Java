package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle(12, "red");
        System.out.printf("Area: %.2f \n",myCircle.getArea());
        System.out.println(myCircle);
    }
}
