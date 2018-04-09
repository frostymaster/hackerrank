package com.frostmaster.algorithms.sorting.ClosestNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int b[] = new int[2*arr.length];
        int k = 0;

        for(int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i] - arr[i + 1]) == min) {
                b[k++]=arr[i];
                b[k++]=arr[i+1];
            }
            else if(Math.abs(arr[i] - arr[i + 1]) < min)
            {
                k = 0;
                b[k++] = arr[i];
                b[k++] = arr[i + 1];
                min = Math.abs(arr[i] - arr[i + 1]);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0)
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
