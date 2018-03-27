package com.frostmaster.algorithms.recursion.ThePowerSum;

import java.util.Scanner;

public class Solution {

    static int powerSum(int X, int N) {
        return doStuff(X, N, 1);
    }

    static int doStuff(int x, int n, int num) {
        int numToN = (int) Math.pow(num, n);
        if (numToN > x) {
            return 0;
        } else if (numToN == x) {
            return 1;
        } else {
            return (doStuff(x, n, num + 1) + doStuff(x - numToN, n, num + 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        System.out.println(result);
        in.close();
    }

}
