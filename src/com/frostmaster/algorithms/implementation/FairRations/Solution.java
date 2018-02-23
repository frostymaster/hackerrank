package com.frostmaster.algorithms.implementation.FairRations;

import java.util.Scanner;

public class Solution {

    static int fairRations(int[] B) {
        int sum = 0;
        for(int i=0; i < B.length; i++){
            sum+=B[i];
        }

        int count = 0;
        if(sum % 2 == 1){
            System.out.println("NO");
        }
        else {
            for (int i = 0; i < B.length; i++) {
                if (B[i] % 2 != 0) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    count += 2;
                }
            }
            System.out.println(count);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        for(int B_i = 0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int result = fairRations(B);

        in.close();
    }

}
