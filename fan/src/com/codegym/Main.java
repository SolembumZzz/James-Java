package com.codegym;

public class Main {

    public static void main(String[] args) {
        fan myFan1 = new fan();
        fan myFan2 = new fan();

        myFan1.setSpeed(3);
        myFan1.setRadius(10);
        myFan1.setColor("yellow");
        myFan1.setStatus(true);
        System.out.println(myFan1);

        myFan2.setSpeed(2);
        myFan2.setRadius(5);
        myFan2.setColor("blue");
        myFan2.setStatus(false);
        System.out.println(myFan2);
    }
}
