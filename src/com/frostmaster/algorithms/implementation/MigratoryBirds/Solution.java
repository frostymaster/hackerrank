package com.frostmaster.algorithms.implementation.MigratoryBirds;

import java.util.Scanner;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] counter = new int[n];
        for(int i = 0; i < n; i++){
            counter[ar[i]]++;
        }

        int max = 0;
        int maxpos = 0;
        for(int i = 0; i < counter.length; i++){
            if (counter[i] > max)
                maxpos = i;
                max = counter[i];
        }

        return maxpos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }

}
