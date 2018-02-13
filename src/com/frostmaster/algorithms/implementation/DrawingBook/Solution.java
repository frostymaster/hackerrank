package com.frostmaster.algorithms.implementation.DrawingBook;

import java.util.Scanner;

public class Solution {

    static int solve(int n, int p){
        int middle = n / 2;

        if(p == 1)
            return 0;

        if(p < middle)
            return p / 2;

        if(p > middle){
            int turns = (n - p) / 2;
            return turns;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

}
