package com.ds.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 1, 2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // in all cases selection sort takes O(n*2) times
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min_ind = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }

}

