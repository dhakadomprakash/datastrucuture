package com.ds.arrays;

public class CheckEquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6};
        System.out.println(isEquilibriumPoint(arr, arr.length));
    }

    public static boolean isEquilibriumPoint(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int l_sum = 0;
        for (int i = 0; i < n; i++) {
            if (l_sum == sum - arr[i]) {
                return true;
            }
            l_sum += arr[i];
            sum -= arr[i];
        }
        return false;
    }
}
