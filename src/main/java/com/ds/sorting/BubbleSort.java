package com.ds.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 1, 2};

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    //optimized bubble sort
    //worst case time complexity is O(n*2)
    // best case time complexity if array is already sorted then it will run for single pass only so time complexity would be O(n)
    static void bubbleSort(int arr[], int n) {
        boolean swapped;

        for (int i = 0; i < n; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }
            }
            if (swapped == false)
                break;
        }
    }

}
