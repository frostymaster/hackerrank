package com.frostmaster.algorithms.MinimumDistances;

import java.util.Scanner;

public class Solution {

    static int minimumDistances(int[] a) {
        int min = -1;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i != j){
                    if(a[i] == a[j]){
                        int result = Math.abs(i - j);
                        if(result < min || min == -1)
                            min = result;
                    }
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }

}
