package com.frostmaster.algorithms.TaumAndBday;

import java.util.Scanner;

public class Solution {

    static long taumBday(int b, int w, int x, int y, int z) {
        long blackPrice = x;
        long whitePrice = y;

        if(x + z < y)
            whitePrice = x + z;

        if(y + z < x)
            blackPrice = y + z;

        return b * blackPrice + w * whitePrice;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }

}
