package com.ds.arrays.searching;

public class FindPeakElements {
    public static void main(String[] args) {
        int[] arr = {7, 10, 8, 20, 12};
        int index = getPeakNaiveSolution(arr);
        int index2 = getPeakUsingBSearchEvenArrayIsNotSorted(arr);
        System.out.println(index);
        System.out.println(index2);
    }

    // O(n) time complexity
    public static int getPeakNaiveSolution(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i + 1]) && arr[i] > arr[i - 1]) return i;
        }
        return -1;
    }

    // O(log n) time complexity
    public static int getPeakUsingBSearchEvenArrayIsNotSorted(int[] arr) {
        int low = 0, high = arr.length - 1;
        int n = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && ((mid == (n - 1)) || arr[mid] >= arr[mid + 1])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
