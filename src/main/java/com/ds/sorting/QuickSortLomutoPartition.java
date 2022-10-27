package com.ds.sorting;

import java.util.Arrays;

public class QuickSortLomutoPartition {
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 9, 3, 10, 5};
        System.out.println(Arrays.toString(arr));
        qSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

    }

    static int iPartition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    static void qSort(int arr[], int l, int h) {
        if (l < h) {
            int p = iPartition(arr, l, h);
            qSort(arr, l, p - 1);
            qSort(arr, p + 1, h);
        }
    }
}
