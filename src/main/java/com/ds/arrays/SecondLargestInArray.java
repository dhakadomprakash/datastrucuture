package com.ds.arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {

        int[] arr = {12, 10, 25, 20, 21, 24, 26, 26};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
        System.out.println("second largest element is " + arr[secondLargest]);
    }

    public static int secondLargest(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1)
            return -1;

        int largest = 0;
        int second = 0;
        for (int i = 1; i < length; i++) {
            if (arr[i] > arr[largest]) {
                second = largest;
                largest = i;
            } else if (arr[i] > arr[second] && arr[i] != arr[largest]) {
                second = i;
            }
        }
        return second;
    }

}
