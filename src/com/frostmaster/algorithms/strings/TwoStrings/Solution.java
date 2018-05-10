package com.frostmaster.algorithms.strings.TwoStrings;

import java.util.Scanner;

public class Solution {

    static String twoStrings(String s1, String s2){

        String result = "NO";

        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                result = "YES";
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }

}
