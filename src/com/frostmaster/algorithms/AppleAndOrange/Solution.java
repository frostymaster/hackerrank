package com.frostmaster.algorithms.AppleAndOrange;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appleeSum = 0;
        int orangeSum = 0;

        int[] apple = new int[m];


        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int l = a + apple[apple_i];
            if(s <= l && l <= t)
                appleeSum++;
        }

        int[] orange = new int[n];

        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int l = b + orange[orange_i];
            if(s <= l && l <= t)
                orangeSum++;
        }
        System.out.println(appleeSum);
        System.out.println(orangeSum);
    }

}
