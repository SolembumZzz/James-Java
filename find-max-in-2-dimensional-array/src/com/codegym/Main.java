package com.codegym;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number of array's height: ");
        int height = input.nextInt();
        System.out.printf("Enter number of array's length: ");
        int length = input.nextInt();
        int[][] myArr = new int[height][length];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("Please enter value of the position [%d][%d]: ", i, j);
                myArr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your array: ");
        System.out.println(displayArrayBeautifully(myArr));
        System.out.println(findMaxElement(myArr));
    }


    public static String displayArrayBeautifully(int[][] arr) {
        String myBeautifulArray = "[\n";
        for (int i = 0; i < arr.length; i++) {
            myBeautifulArray += "\t" + Arrays.toString(arr[i]) + ",\n";
        }
        myBeautifulArray += "]";
        return myBeautifulArray;
    }

    public static String findMaxElement(int[][] arr) {
        String deeMax = "Your biggest element is ";
        String whereMaxIs = ". It is located in ";
        String position = "[0][0]";
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (max == arr[i][j]) {
                    position += String.format(", [%d][%d]", i, j);
                }
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    position = String.format("[%d][%d]", i, j);
                }
            }
        }
        deeMax += max + whereMaxIs + position + ".";

        return deeMax;
    }
}
