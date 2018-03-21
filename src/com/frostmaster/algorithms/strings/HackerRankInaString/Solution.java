package com.frostmaster.algorithms.strings.HackerRankInaString;

import java.util.Scanner;

public class Solution {

    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        if (s.length() < hackerrank.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < hackerrank.length() && s.charAt(i) == hackerrank.charAt(j)) {
                j++;
            }
        }
        return (j == hackerrank.length() ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }

}
