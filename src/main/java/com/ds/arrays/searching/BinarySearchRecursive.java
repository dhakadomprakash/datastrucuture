package com.ds.arrays.searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int index = binarySearch(arr, 0, arr.length - 1, 60);
        System.out.println(index);
    }

    //    time complexity O(log n), auxiliary space O(log n) bcz it hold recursive call to the method call stack
    public static int binarySearch(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (x == arr[mid]) {
            return mid;
        } else if (x < arr[mid]) {
            return binarySearch(arr, low, mid - 1, x);
        } else {
            return binarySearch(arr, mid + 1, high, x);
        }
    }
}
