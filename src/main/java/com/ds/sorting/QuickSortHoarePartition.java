package com.ds.sorting;

import java.util.Arrays;


public class QuickSortHoarePartition {
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 9, 3, 10, 5};
        System.out.println(Arrays.toString(arr));
        qSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

    }

    //In many study mention that hoarse partition works 3 time faster than lomuto partition
    private static void qSort(int[] arr, int l, int h) {
        if (l < h) {
            int p = hPartition(arr, l, h);
            qSort(arr, l, p);
            qSort(arr, p + 1, h);
        }
    }

    private static int hPartition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) return j;
            //swap i,j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
