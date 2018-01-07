package com.frostmaster.algorithms.TheHurdleRace;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int magicPotionsUsed = 0;

        int[] height = new int[n];

        for(int height_i=0; height_i < n; height_i++){

            height[height_i] = in.nextInt();


            if( height[height_i] > k ){

                magicPotionsUsed += height[height_i] - k;
                k = height[height_i];
            }
        }

        System.out.println( magicPotionsUsed );
    }

}
