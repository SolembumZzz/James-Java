package com.codegym;

public class fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed  = newSpeed;
    }

    public boolean getStatus () {
        return this.on;
    }

    public void setStatus (boolean newStatus) {
        this.on = newStatus;
    }

    public double getRadius () {
        return this.radius;
    }

    public void setRadius (double newRadius) {
        this.radius = newRadius;
    }

    public String getColor () {
        return this.color;
    }

    public void setColor (String newColor) {
        this.color = newColor;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "fan{" +
                    "on=" + on +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is on" +
                    '}';
        } else {
            return "fan{" +
                    "on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is off" +
                    '}';
        }
    }
}
