package com.ds.sorting;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 4, 5, 8, 11, 6, 26};

        int n = arr.length;
        int k = 4;
        int index = kthSmallest(arr, n, k);

        System.out.print(arr[index]);
    }

    //average and best case time complexity is nlogn and worst case it will take n2 time
    private static int kthSmallest(int[] arr, int n, int k) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int p = lPartition(arr, l, h);

            if (p == k - 1) {
                return p;
            } else if (p < k - 1) {
                l = p + 1;
            } else {
                h = p - 1;
            }
        }
        return -1;
    }

    private static int lPartition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

        return i + 1;

    }
}
