package com.frostmaster.algorithms.implementation.NonDivisibleSubset;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static int nonDivisibleSubset(int k, int[] arr) {
        boolean even = false;
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            even = false;
            for(int j = 0; j < arr.length; j++){
                if(i == j)
                    continue;
                if((arr[i] + arr[j]) % 3 == 0){
                    even = true;
                    break;
                }
            }
            if(!even)
                arraylist.add(arr[i]);
        }
        return arraylist.size();
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
