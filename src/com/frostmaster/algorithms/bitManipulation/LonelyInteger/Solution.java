package com.frostmaster.algorithms.bitManipulation.LonelyInteger;

import java.util.Scanner;

public class Solution {

    static int lonelyinteger(int[] a) {
        int val = 0;
        for (int num : a) {
            val = val ^ num; // ^ is XOR operator
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }

}
