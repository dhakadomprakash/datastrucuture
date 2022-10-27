package com.ds.arrays.searching;

public class SquareRootOfNumber {
    public static void main(String[] args) {
            System.out.println(sqRootFloor(16));
    }

    //    O(log n)
    public static int sqRootFloor(int x) {
        int low = 1, high = x, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int msq = mid * mid;
            if (msq == x) {
                return mid;
            } else if (msq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }

        }
        return ans;
    }
}
