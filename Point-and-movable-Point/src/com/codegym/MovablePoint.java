package com.codegym;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public String move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this.toString();
    }
}
