package com.frostmaster.algorithms.FindDigits;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            int temp = c[i];
            int result = 0;
            int digits = 0;
            while ( temp != 0) {
                result = temp%10;
                temp /= 10;
                if(result == 0)
                    continue;
                if(c[i] % result == 0)
                    digits++;
            }
            System.out.println(digits);
        }
    }

}
