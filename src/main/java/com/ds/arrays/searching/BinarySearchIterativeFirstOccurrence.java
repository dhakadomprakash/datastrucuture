package com.ds.arrays.searching;

public class BinarySearchIterativeFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 15, 20, 20, 20};
        int index = binarySearchFirstOccurrence(arr, 20);
        System.out.println(index);
    }

    public static int binarySearchFirstOccurrence(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

