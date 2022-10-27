package com.ds.test;

import java.util.ArrayList;

public class Sample {
    //Input :- 1234
    //Output :- 4321
//Given a string s, find the length of the longest substring without repeating characters.
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

//    Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


    public static void main(String[] args) {

        System.out.println(getLongestSubStr("abcabcbb"));
    }

    public static int getLongestSubStr(String s) {
        char[] ch = s.toCharArray();

        //abcdefcfdef

        ArrayList<Character> al = new ArrayList<>();
        int maxRes = 0;
//O(n)
        for (int i = 0; i < ch.length; i++) {
            if (al.contains(ch[i])) {
                maxRes = Math.max(al.size(), maxRes);
                al.clear();
                al.add(ch[i]);

            } else {
                al.add(ch[i]);
            }
        }
        return maxRes;

    }
}