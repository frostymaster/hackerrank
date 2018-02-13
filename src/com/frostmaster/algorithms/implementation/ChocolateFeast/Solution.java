package com.frostmaster.algorithms.implementation.ChocolateFeast;

import java.util.Scanner;

public class Solution {

    static int chocolateFeast(int n, int c, int m) {
        int totalChoc = n / c;
        int totalWrappers = totalChoc;

        while(m<=totalWrappers){
            totalWrappers = totalWrappers - m;
            totalChoc++;
            totalWrappers++;
        }
        return totalChoc;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }

}
