package com.frostmaster.algorithms.CountingValleys;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isBelowSea = false;

        int steps = 0;

        int belowSeaLevel = 0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        String terrain = input.nextLine();

        char[] stepsChar = terrain.toCharArray();

        for(int i = 0; i < stepsChar.length; i++){
            if(stepsChar[i] == 'U'){
                belowSeaLevel++;
            } else {
                belowSeaLevel--;
            }

            if(!isBelowSea && belowSeaLevel < 0) {
                    steps++;
                    isBelowSea = true;
            }

            if(belowSeaLevel >= 0)
                isBelowSea = false;

        }

        System.out.print(steps);
    }

}
