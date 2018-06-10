package com.frostmaster.ProjectEuler.EvenFibonacciNumbers;

import java.util.Scanner;

public class Solution {

    public static long fibo(long n){
        if (n < 2)
            return 0;

        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;

        while (ef2 <= n)
        {
            long ef3 = 4 * ef2 + ef1;

            if (ef3 > n)
                break;

            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(fibo(n));
        }
    }

}
