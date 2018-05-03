package com.frostmaster.algorithms.gameTheory.ChessboardGame;

import java.util.Scanner;

public class Solution {

    static String chessboardGame(int x, int y) {
        if ((x % 4 == 1 || x % 4 == 2) && (y % 4 == 1 || y % 4 == 2)) {
            return "Second";
        } else {
            return "First";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            String result = chessboardGame(x, y);
            System.out.println(result);
        }
        in.close();
    }

}
