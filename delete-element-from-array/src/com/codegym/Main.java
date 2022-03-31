package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = new int[]{3, 7, 8, 4, 6};
        int[] newArr = deleteElementFromArray(myArr, 7);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] deleteElementFromArray(int[] arr, int element) {
        int[] myNewArr = new int[arr.length - 1];
        int elementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                elementIndex = i;
            }
        }

        for (int i = 0; i < elementIndex; i++) {
            myNewArr[i] = arr[i];
        }

        for (int i = elementIndex; i < myNewArr.length; i++) {
            myNewArr[i] = arr[i + 1];
        }

        return myNewArr;
    }
}
