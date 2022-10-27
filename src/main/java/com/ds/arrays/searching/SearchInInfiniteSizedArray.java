package com.ds.arrays.searching;

public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};

        int x = 40;

        System.out.println(search(arr, x));
    }

    //time complexity is O(log position) time
    public static int search(int[] arr, int x) {
        if (arr[0] == x) return 0;
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
        }
        if (arr[i] == x) return i;
        return BinarySearchRecursive.binarySearch(arr, i / 2 + 1, i - 1, x);

    }
}
