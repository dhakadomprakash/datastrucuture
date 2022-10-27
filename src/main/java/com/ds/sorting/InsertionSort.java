package com.ds.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 1, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //best case time complexity O(n) and worst case time complexity is O(n*2)
    //auxiliary space O(1)
    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
