package com.ds.sorting;


import java.util.Arrays;

class Interval implements Comparable<Interval> {
    int s;
    int e;

    public Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public String toString() {
        return "(" +
            s +
            ", " + e +
            ")";
    }


    @Override
    public int compareTo(Interval o) {
        return this.s - o.s;
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        Interval[] arr = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30),
            new Interval(2, 7)};

        mergeIntervals(arr, arr.length);
    }

    // time complexity in O(nlogn) because we are using sorting here which takes nlogn time
    public static void mergeIntervals(Interval[] arr, int n) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int res = 0;

        for (int i = 1; i < n; i++) {
            if (arr[res].e >= arr[i].s) {
                arr[res].s = Math.min(arr[res].s, arr[i].s);
                arr[res].e = Math.max(arr[res].e, arr[i].e);
            } else {
                res++;
                arr[res] = arr[i];
            }
        }
        // print elements till res
        for (int i = 0; i <= res; i++) {
            System.out.print(arr[i].toString());
            System.out.print(", ");
        }
    }

}
