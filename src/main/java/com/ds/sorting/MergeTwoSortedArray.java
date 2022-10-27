package com.ds.sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50};
        int[] brr = {5, 50, 50};

        merge(arr, brr, arr.length, brr.length);
    }

    //  case time complexity theta(m+n) , auxiliary space is O(1)
    public static void merge(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else
                System.out.print(b[j++] + " ");
        }
        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");
    }
}
