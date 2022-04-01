package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array length:");
        int l = input.nextInt();
        int[] myArr = new int[l];
        int count = 0;
        do {
            System.out.println("Please enter the next array element:");
            int newElement = input.nextInt();
            myArr[count] = newElement;
            count++;
        } while (count < l);
        System.out.println("Your array: " + Arrays.toString(myArr));
        System.out.println("Your min element is: " + findMin(myArr));
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
