package com.ds.test;

import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class Test {


    public static void main(String[] args) {
        String str = "Houston we have a problem.";
        str.replaceAll(".", "");
        String[] s = str.split(" ");

        TreeSet<String> ts = new TreeSet<>((s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return 1;
            }
        });

        ts.addAll(Arrays.asList(s));
        String builder = "";
        int i = 0;
        for (String t: ts) {
            if(i==0){
                builder= builder+ t.toUpperCase(Locale.ROOT)+ " ";
                i++;
            }else{
                builder= builder+ t+ " ";
            }

        }
        builder.trim();
        builder= builder+ ".";


        System.out.println(builder);
    }
}

