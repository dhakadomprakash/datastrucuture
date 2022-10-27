package com.ds.arrays.searching;

public class TwoPointersApproachToFindPairOfGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 30};
        System.out.println(isPair(arr, 17));
    }

    // time complexity O(n), space O(1)
    public static boolean isPair(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                System.out.println(i + " ," + j);
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}


