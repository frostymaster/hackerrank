package com.frostmaster.ProjectEuler.LargestPrimeFactor;

import java.util.Scanner;

public class Solution {

    static long primeCount(long n) {
        int i;

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                i--;
            }
        }
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            primeCount(n);
        }
    }

}
