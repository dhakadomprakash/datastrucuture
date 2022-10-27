package com.ds.arrays.searching;

public class BinarySearchRecursiveFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 15, 20, 20, 20};
        int index = binarySearchFirstOccurrence(arr, 0, arr.length - 1, 20);
        System.out.println(index);
    }

    //    time complexity O(log n), auxiliary space O(log n) bcz it hold n recursive call to the method call stack
    public static int binarySearchFirstOccurrence(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (x < arr[mid]) {
            return binarySearchFirstOccurrence(arr, low, mid - 1, x);
        } else if (x > arr[mid]) {
            return binarySearchFirstOccurrence(arr, mid + 1, high, x);
        } else {
            if (mid == 0 || arr[mid] != arr[mid - 1]) {
                return mid;
            } else {
                return binarySearchFirstOccurrence(arr, low, mid - 1, x);
            }
        }
    }
}
