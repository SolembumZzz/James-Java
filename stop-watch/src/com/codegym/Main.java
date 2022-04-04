package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] myArr = new double[100000];
        int i;
        do {
            for (i = 0; i < myArr.length; i++) {
                myArr[i] =  Math.random()*20000;
            }
        } while (i != myArr.length);

        Stopwatch myTime = new Stopwatch();
        myTime.start();
        System.out.println("Sorting started at" + myTime.getStartTime());
        for (i = 0; i < myArr.length-1; i++) {
            for (int j = 1; j < myArr.length; j++) {
                if (myArr[i] > myArr[j]) {
                    double temp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = temp;
                }
            }
        };
        myTime.end();
        System.out.println("Sorting ended at: " + myTime.getEndTime());
        System.out.println("Elapsed time: " + myTime.getElapsedTime());
    }
}
