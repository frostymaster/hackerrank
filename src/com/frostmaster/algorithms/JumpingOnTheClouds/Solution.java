package com.frostmaster.algorithms.JumpingOnTheClouds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int e = 100;
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int step = 0;
        int cloud = 0;
        while(e > 0){
            e--;
            cloud = (cloud + k) % n;
            if(c[cloud] == 1)
                e = e - 2;
            if(cloud == 0)
                break;
        }

        System.out.println(e);
    }

}
