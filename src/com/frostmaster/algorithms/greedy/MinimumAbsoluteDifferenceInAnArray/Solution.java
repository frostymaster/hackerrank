package com.frostmaster.algorithms.greedy.MinimumAbsoluteDifferenceInAnArray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        int min = Math.abs(arr[0]-arr[1]);

        for(int i = 2; i < n; i++) {
            int y = Math.abs(arr[i] - arr[i-1]);
            if(y < min)
                min = y;
            if(min == 0)
                break;
        }

        if(Math.abs(arr[n-1] - arr[0]) < min)
            min = Math.abs(arr[n-1]-arr[0]);

        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }

}
