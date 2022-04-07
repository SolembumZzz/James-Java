package com.codegym;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + ", y=" + getY() + ", z=" + z + '}';
    }

    public static void main(String[] args) {
        Point3D myPoint = new Point3D(3.3f, 4.4f, 5.5f);
        System.out.println(Arrays.toString(myPoint.getXYZ()));
        myPoint.setXYZ(6.6f, 7.7f, 8.8f);
        System.out.println(myPoint);
    }
}
