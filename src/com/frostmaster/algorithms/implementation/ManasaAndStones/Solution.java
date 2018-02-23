package com.frostmaster.algorithms.implementation.ManasaAndStones;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

    static Object[] stones(int n, int a, int b) {
        TreeSet<Integer> finalStones = new TreeSet<Integer>();

        for(int i = 0; i < n; i++){
            int sum = (i * a) + ((n-1-i)*b);
            finalStones.add(sum);
        }

        return finalStones.toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            Object[] result = stones(n, a, b);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }

}
