package com.frostmaster.algorithms.implementation.JumpingOnTheClouds2;

import java.util.Scanner;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int steps = 0;
        while(i < c.length){
            if(i + 2 > c.length){
                //steps++;
                return steps;
            } if(i + 2 == c.length) {
                steps++;
                return steps;
            } else
            {
                if(c[i + 2] != 1)
                    i = i + 2;
                else
                    i = i + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }

}
