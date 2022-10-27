package com.ds.arrays;

public class MaxConsecutive1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1};
        //o/p=2 bcs max consecutive 1 count is 2
        System.out.println(calculateMaxConsecutive1s(arr));
    }

    public static int calculateMaxConsecutive1s(int[] arr) {
        int res = 0;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1)
                current = 0;
            else {
                ++current;
                res = Math.max(current, res);
            }
        }
        return res;
    }
}
