package com.ds.arrays;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {10, 9, 20, 21, 19};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {
        int length = arr.length;
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
