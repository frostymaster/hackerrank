package com.frostmaster.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDivisibleSubset {

    static int nonDivisibleSubset(int k, int[] arr) {
        int[] remainders = new int[k];
        for(int i = 0; i < arr.length; i++) {
            remainders[arr[i] % k]++;
        }

        int result = 0;
        if(k % 2 == 0) {
            result++;
        }

        for(int i = 1; i <= k / 2; i++) {
            if(i != k - i) {
                result += Math.max(remainders[i], remainders[k - i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = nonDivisibleSubset(k, arr);
        System.out.println(result);
        in.close();
    }

}
