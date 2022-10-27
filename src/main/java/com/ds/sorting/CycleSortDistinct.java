package com.ds.sorting;

import java.util.Arrays;

public class CycleSortDistinct {
    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 10, 30};
        int n = arr.length;
        cycleSortDistinct(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    // time complexity O(n*2) we use cycle sort when you want minimal memory write operation
    public static void cycleSortDistinct(int[] arr, int n) {

        for (int cs = 0; cs < n - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            //swap
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                //swap
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }

    }
}
