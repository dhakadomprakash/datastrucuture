package com.ds.arrays;

import java.util.Arrays;

public class LeftRotateByD {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("left rotate by 2: ");
        leftRotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotate(int[] arr, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
