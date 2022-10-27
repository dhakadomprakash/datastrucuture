package com.ds.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {10, 9, 0, 0, 5, 6, 0, 7};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int moveZero(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, count, i);
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
