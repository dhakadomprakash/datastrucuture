package com.ds.arrays;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 5, 6};
        int n = deleteElement(arr, 12);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int deleteElement(int[] arr, int e) {
        if (arr.length == 0) {
            return -1;
        }
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                break;
            }
        }

        if (i == arr.length) {
            return arr.length;
        }

        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return arr.length - 1;
    }
}
