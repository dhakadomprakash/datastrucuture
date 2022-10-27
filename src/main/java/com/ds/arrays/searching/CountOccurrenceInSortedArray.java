package com.ds.arrays.searching;

public class CountOccurrenceInSortedArray {
    public static void main(String[] args) {
        int arr[] = {20, 20, 20, 20, 40, 40};
        int x = 30;
        System.out.println(countOcc(arr, x));
    }


    //it take O(log n) times and O(1) auxiliary space
    static int countOcc(int arr[], int x) {
        int first = firstOccurrence(arr, x);

        if (first == -1)
            return 0;
        else
            return lastOccurrence(arr, x) - first + 1;
    }


    public static int firstOccurrence(int[] arr, int x) {
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

    public static int lastOccurrence(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == (n - 1) || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
