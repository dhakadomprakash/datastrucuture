package com.ds.test;

import java.util.Set;
import java.util.TreeSet;

public class Child extends Parent {
    public void m1() {
        System.out.println("Child m1");
    }

    public static void main(String[] args) {
       Set s = new TreeSet();
       s.add("2");
       s.add("2");
       s.add(1);
        System.out.println(s);
    }
}
