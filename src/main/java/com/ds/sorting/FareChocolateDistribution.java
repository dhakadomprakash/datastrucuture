package com.ds.sorting;

import java.util.Arrays;

public class FareChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = new int[]{7, 3, 1, 8, 9, 12, 56};
        int children = 3;
        int minDiff = getMinDiffAfterFareDistribution(arr, children);
        System.out.println(" minDiff " + minDiff);
    }

    //time complexity is O(nlogn)
    static int getMinDiffAfterFareDistribution(int[] arr, int m) {
        int n = arr.length;
        if (m > n) {
            return -1;
        }
        //O(nlogn)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int res = arr[m - 1] - arr[0];
        //theta(n)
        for (int i = 1; (i + m - 1) < n; i++) {
            res = Math.min(res, (arr[i + m - 1] - arr[i]));
        }
        return res;
    }


}
