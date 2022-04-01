package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 4, 6, 9};
        int[] arr2 = new int[]{6, 8, 6, 9};
        int[] arr3 = concat(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            if (i >= arr1.length) {
                arr3[i] = arr2[i-arr1.length];
            }
        }

        return arr3;
    }
}
