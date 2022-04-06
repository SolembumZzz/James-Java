package com.codegym;

public class Cylinder extends Circle {
    private double radius = 1;
    private String color = "yellow";
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
