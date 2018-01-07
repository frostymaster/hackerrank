package com.frostmaster.SequenceEquation;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n+1];

        for(int i = 1; i < n+1; i++){
            int input = in.nextInt();
            arr[input] = i;
        }

        for(int i = 1; i < n+1; i++){
            System.out.println(arr[arr[i]]);
        }

    }

}
