package com.frostmaster.algorithms.implementation.BreakingTtheRecords;

import java.util.Scanner;

public class Solution {

    static int[] getRecord(int[] s){
        int max = s[0];
        int maxBreaks = 0;
        int min = s[0];
        int minBreaks = 0;
        int result[] = new int[2];
        for(int i = 1; i < s.length; i++){
            if(s[i] > max){
                max = s[i];
                maxBreaks++;
            }
            if(s[i] < min){
                min = s[i];
                minBreaks++;
            }
        }
        result[0] = maxBreaks;
        result[1] = minBreaks;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
