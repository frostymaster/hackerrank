package com.frostmaster.algorithms.implementation.GradingStudents;

import java.util.Scanner;

public class Solution {

    static int[] solve(int[] grades){

        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] < 38 || result[i] % 5 < 3 ? result[i] : result[i] + (5 - (result[i] % 5)));
        }
        System.out.println("");
    }



}
