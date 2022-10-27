package com.ds.arrays;

public class TrappingWaterUnit {

    // time complexity @(n), auxiliary space= @(n)
    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 2, 3};
//                   {5, 0, 6, 2, 3};
        System.out.println(waterUnit(arr));
    }

    public static int waterUnit(int[] arr) {
        int res = 0;
        int n = arr.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        //lmax= {5,5,6,6,6}
        //rmax= {6,6,6,3,3}

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }

        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }

        return res;
    }
}

   