package com.ds.arrays.searching;

public class TripletInASortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 15, 18};
        int x = 33;
        System.out.println(isTriplet(arr, x));
    }

    public static boolean isPair(int[] arr, int begin, int x) {
        int i = begin, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                System.out.print(i + " , " + j);
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    // time complexity O(n*2)
    public static boolean isTriplet(int[] arr, int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (isPair(arr, i + 1, x - arr[i])) {
                System.out.print("  " + i + " ");
                return true;
            }
        }
        return false;
    }
}
