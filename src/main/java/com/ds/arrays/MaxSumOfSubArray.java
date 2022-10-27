package com.ds.arrays;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 4, -5, 6};
        System.out.println(maxSumOfSubArray(arr));
    }
    public static int maxSumOfSubArray(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
}
