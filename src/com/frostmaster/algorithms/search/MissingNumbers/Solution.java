package com.frostmaster.algorithms.search.MissingNumbers;

import java.util.Scanner;

public class Solution {

    static int[] missingNumbers(int[] arr, int[] brr) {
        int [] result = new int[10001];
        for(int i = 0; i < arr.length; i++){
            result[arr[i]]--;
        }

        for(int i = 0; i < brr.length; i++){
            result[brr[i]]++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            if(result[i] > 0)
                System.out.print(i + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
