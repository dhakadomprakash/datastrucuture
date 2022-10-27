package com.ds.recursion;

public class GenerateSubsetOfString {
    public static void generateSubset(String str, String curr, int index) {

        if (index == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        generateSubset(str, curr, index + 1);
        generateSubset(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        generateSubset("ABC", "", 0);
    }
}
