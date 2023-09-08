package com.learn.java.lambda;

import java.util.Comparator;

public class JavaComparator {
    public static void main(String[] args) {

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1<o2?-1:o1>o2?1:0;
            }
        };
        System.out.println(c.compare(4,4));
        Comparator<Integer> c1 = (a,b)->a.compareTo(b);
        System.out.println(c1.compare(3,6));
    }
}
