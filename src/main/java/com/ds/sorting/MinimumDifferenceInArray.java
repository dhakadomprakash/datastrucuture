package com.ds.sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 4, 5, 8, 11, 6, 26};
        System.out.println(getMinDiff(arr));
    }

    static int getMinDiff(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i] - arr[i - 1]);
        }
        return res;
    }
}
