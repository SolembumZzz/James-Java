package com.codegym;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = 0;
        do {
            System.out.println("Please enter the number of students:");
            l = input.nextInt();
            if (l > 30 || l < 1) {
                System.out.println("The number cannot be bigger than 30 and smaller than 1.");
            }
        } while (l >30 || l<1);

        float[] myScore = new float[l];
        int no = 0;
        do {
            System.out.println("Enter the next student's score:");
            float newScore = input.nextFloat();

            if (newScore >= 0 && newScore <= 10) {
                myScore[no] = newScore;
                no++;
            } else {
                System.out.printf("%.2f this is not a valid score.\n", newScore);
            }
        } while (no < l);

        System.out.println("Your score list: " + Arrays.toString(myScore));
        System.out.printf("There are %d students that passed.", findPassingNumber(myScore));
    }

    public static int findPassingNumber(float[] arr) {
        int passingNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                passingNumber++;
            }
        }
        return passingNumber;
    }
}
