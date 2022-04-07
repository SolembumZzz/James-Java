package com.codegym;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Point myPoint = new Point(1,2);
//        System.out.println(Arrays.toString(myPoint.getXY()));
//        myPoint.setXY(7,8.8f);
//        System.out.println(myPoint);

        MovablePoint myMovablePoint = new MovablePoint(5,2,5,2);
        System.out.println(myMovablePoint.move());
//        System.out.println(myMovablePoint.move());
//        System.out.println(myMovablePoint.move());
        System.out.println(Arrays.toString(myMovablePoint.getXY()));
    }
}
