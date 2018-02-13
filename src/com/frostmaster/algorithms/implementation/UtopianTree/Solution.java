package com.frostmaster.algorithms.implementation.UtopianTree;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height = 0;
        for(int a0 = 0; a0 < n; a0++){
            int t = in.nextInt();
            if(t%2 == 0)
                height = (int)(Math.pow(2, t/2) - 1)*2 + 1;
            else
                height = (int)(Math.pow(2, t/2 + 1) - 1)*2;

            System.out.println(height);
        }
    }

}
