package com.ds.arrays;

public class MaxDifferenceBwElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 67, 32, 4, 72, 3, 12, 9};
        System.out.println("maxDifference is " + maxDifference(arr));
    }

    public static int maxDifference(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (max - min);
    }
}
