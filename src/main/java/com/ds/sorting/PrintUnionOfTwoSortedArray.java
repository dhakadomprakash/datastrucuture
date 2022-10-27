package com.ds.sorting;

public class PrintUnionOfTwoSortedArray {
    public static void main(String[] args) {
        int a[] = new int[]{3, 8, 8};
        int b[] = new int[]{2, 8, 8, 10, 15};

        int m = a.length;
        int n = b.length;
        printUnion(a, b, m, n);
    }

    // time complexity O(m+n)  linear only
    private static void printUnion(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while (i < m) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }

        while (j < n) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }
}
