package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = new int[]{10, 4, 7, 8};
        int[] newArr = addElementFromArray(myArr, 69, 3);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] addElementFromArray(int[] arr, int element, int position) {
        int[] myNewArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            myNewArr[i] = arr[i];
        }

        myNewArr[position] = element;

        for (int i = position + 1; i < myNewArr.length; i++) {
            myNewArr[i] = arr[i-1];
        }

        return myNewArr;
    }
}
