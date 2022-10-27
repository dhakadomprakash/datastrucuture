package com.ds.recursion;

public class JosephusProblem {

    //    if index begin with 0
    public static int jos(int n, int k) {
        if (n == 1) return 0;
        else
            return (jos(n - 1, k) + k) % n;
    }

    //if index begin with 1 then add 1 to above method output
    static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }


    public static void main(String[] args) {
        // complexity theta(n)
        System.out.println(myJos(5, 3));
    }
}
