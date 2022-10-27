package com.ds.arrays.searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int index = binarySearch(arr, 60);
        System.out.println(index);
    }

    //    time complexity O(log n), auxiliary space O(1)
    public static int binarySearch(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
