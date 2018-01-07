package com.frostmaster.algorithms.BirthdayChocolate;

import java.util.Scanner;

public class Solution {

    static int solve(int n, int[] s, int d, int m){

        if(s.length == 1)
            if(s[0] == d)
                return 1;

        int sum = 0;
        for(int i = 0; i < s.length; i++){
            if(s.length - i < d)
                break;

            int tempSum = 0;
            for(int j = i; j <= m;j++){
                tempSum = tempSum + s[j];
            }
            if(tempSum == d){
                sum = sum + 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
