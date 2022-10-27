package com.ds.arrays;

public class PrintFreqOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 30, 30, 40, 40, 40, 40, 50};
        printFreq(arr);
    }

    // the time complexity of this method is O(n) because we are traversing array only once
    public static void printFreq(int[] arr) {
        int n = arr.length;
        int freq = 1;
        int i = 1;

        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                ++freq;
                ++i;
            }
            System.out.println(arr[i - 1] + " : " + freq);
            i++;
            freq = 1;
        }
        if (arr.length == 1 || arr[n - 2] != arr[n - 1]) {
            System.out.println(arr[n - 1] + " : " + 1);
        }
    }
}
