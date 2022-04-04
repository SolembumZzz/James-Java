package com.codegym;

public class Quadraticequation {
    private double a, b, c;

    public Quadraticequation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
    }

    public String calculate() {
        if (getDiscriminant() < 0) {
            return "This equation has no solution.";
        } else if (getDiscriminant() == 0) {
            return "This equation has double solution: x1 = x2 = " + (-this.b/2*this.a);
        } else {
            return "This equation has two solution: x1 = " + getRoot1() + ", x2 = " + getRoot2();
        }
    }
}
