package com.frostmaster.algorithms.implementation.BirthdayCakeCandles;

import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {

        int max = 0;
        int contains = 0;

        for(int i = 0; i < n; i++){
            if(ar[i] > max)
                max = ar[i];
        }

        for(int i = 0; i < n; i++){
            if(ar[i] == max)
                contains++;
        }

        return contains;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
