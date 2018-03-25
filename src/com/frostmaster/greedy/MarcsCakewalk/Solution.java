package com.frostmaster.greedy.MarcsCakewalk;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static long marcsCakewalk(int[] calorie) {

        long miles = 0;

        // SOME CRAZY ASS SORTING COMING IN
        for(int i = 0; i < calorie.length; i++){
            calorie[i] = calorie[i] * (-1);
        }

        Arrays.sort(calorie);

        for(int i = 0; i < calorie.length; i++){
            calorie[i] = calorie[i] * (-1);
        }
        // THAT WAS INSANE 

        for(int i = 0; i < calorie.length; i++){
            miles = miles + (calorie[i] * (long)Math.pow(2, i));
        }
        return miles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }

}
