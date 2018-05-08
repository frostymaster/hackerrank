package com.frostmaster.algorithms.strings.MakingAnagrams;

import java.util.Scanner;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        int[] charSeq1 = new int[26];
        int[] charSeq2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            charSeq1[s1.charAt(i)-97]++;
        }

        for(int i = 0; i < s2.length(); i++){
            charSeq2[s2.charAt(i)-97]++;
        }

        int count = 0;

        for(int i = 0; i < 26; i++){
            count += Math.abs(charSeq1[i]-charSeq2[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }

}
