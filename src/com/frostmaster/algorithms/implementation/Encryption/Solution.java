package com.frostmaster.algorithms.implementation.Encryption;

public class Solution {

    public static int fn(int i) {
        if (i < 1) {
            throw new AssertionError();
        }
        if (i < 3) {
            return 1;
        }
        return fn(i-1) + fn(i-2);
    }

    public static void main(String[] args) {
        fn(5);
    }

}


