package com.ds.arrays.searching;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 5, 8};
        int index = search(arr, 8);
        System.out.println(index);
    }

    // time complexity is O(log n)
    public static int search(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            // it means left half is sorted
            if (arr[low] < arr[mid]) {
                // it means element lies in left half
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    // it means element lies in right half
                    low = mid + 1;
                }
            } else {
                // it means right half is sorted
                if (x > arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
