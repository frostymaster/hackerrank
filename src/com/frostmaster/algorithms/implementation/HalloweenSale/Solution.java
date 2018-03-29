package com.frostmaster.algorithms.implementation.HalloweenSale;

import java.util.Scanner;

import static java.lang.StrictMath.max;

public class Solution {

    static int howManyGames(int p, int d, int m, int s) {
        int boughtGames = 0;
        while (s > 0) {
            int price = max(p - d * boughtGames, m);
            s -= price;
            if (s >= 0)
                boughtGames++;
        }
        return boughtGames;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }

}
