package com.frostmaster.algorithms.implementation.BonAppetit;

import java.util.Scanner;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;

        for(int i = 0; i < n; i++){
            if(i != k)
                sum += ar[i];
        }

        sum = sum / 2;
        if(sum < b)
            return b - sum;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result > 0)
            System.out.println(result);
        else
            System.out.println("Bon Appetit");
    }

}
