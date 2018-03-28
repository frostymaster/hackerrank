package com.frostmaster.algorithms.gameTheory.GameOfStones;

import java.util.Scanner;

public class Solution {

    static String gameOfStones(int n) {
        double result  = n % 7;
        double result2  = (n -1) % 7;
        if (result == 0 || result2 == 0)
            return "Second";
        else
            return "First";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String result = gameOfStones(n);
            System.out.println(result);
        }
        in.close();
    }

}
