package com.codegym;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(4, 5, "white");
        System.out.printf("Volume: %.2f \n", myCylinder.getVolume());
        System.out.println(myCylinder);
    }
}
