package com.ds.arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 30, 30, 40, 40, 40, 50};
        int size = removeDuplicate(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicate(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
