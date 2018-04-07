package com.frostmaster.algorithms.gameTheory.TowerBreakers;

import java.util.Scanner;

public class Solution {

    static int towerBreakers(int n, int m) {
        int player;
        if (n % 2 == 0)
            player = 2;
        else
            player = 1;
        if(m == 1)
            player = 2;
        return player;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int result = towerBreakers(n, m);
            System.out.println(result);
        }
        in.close();
    }

}
