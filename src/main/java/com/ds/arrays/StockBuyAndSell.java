package com.ds.arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        System.out.println("Max Profit: "+ maxProfit(arr));
    }

    static int maxProfit(int[] arr) {
        int profit = 0;
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }
}
