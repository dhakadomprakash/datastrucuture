package com.ds.sorting;

import java.util.Arrays;

public class SortArrayWithTwoTypesOfElement {
    public static void main(String[] args) {
        int[] arr = {-12, 18, -10, 15};

        System.out.println("Before: " + Arrays.toString(arr));
        sortUsingHoarePartition(arr, arr.length);

        System.out.println("After: " + Arrays.toString(arr));


    }

    //time complexity is theta(n) since it takes single iteration
    //space O(1)
    public static void sortUsingHoarePartition(int[] arr, int n) {
        //so h is n-1

        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);

            do {
                j--;
            } while (arr[j] > 0);

            if (i >= j) {
                return;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }
}
