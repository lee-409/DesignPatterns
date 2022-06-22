package com.test.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {9,2,3,5,4,1};
        Cat[] a = {new Cat(5,5), new Cat(3,3), new Cat(1,1)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
