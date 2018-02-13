package com.frostmaster.algorithms.implementation.DivisibleSumPairs;

import java.util.Scanner;

public class Algorithms {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairCount = 0;

        int[] remainderCountList = new int[k];

        for (int i = 0; i < ar.length; i++) {
            int remainder = ar[i] % k;
            remainderCountList[remainder]++;
        }

        int exactCount = remainderCountList[0];
        pairCount += (exactCount * (exactCount-1)) / 2;

        for(int i = 1; i <= k/2 && i != k-i; i++) {
            pairCount += remainderCountList[i] * remainderCountList[k-i];
        }

        if (k % 2 == 0) {
            int halfCount = remainderCountList[k/2];
            pairCount += (halfCount * (halfCount-1)) / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
