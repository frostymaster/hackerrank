package com.frostmaster.algorithms.arrays.LeftRotation;

public class Solution {

    static int[] rotLeft(int[] a, int d) {
        int[] a2 = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int newLocation = (i + (a.length - d)) % a.length;
            a2[newLocation] = a[i];
        }

        return a2; 
    }

}
