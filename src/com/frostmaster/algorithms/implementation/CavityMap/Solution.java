package com.frostmaster.algorithms.implementation.CavityMap;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static Object[] cavityMap(String[] grid) {
        ArrayList<String> result = new ArrayList<>();
        result.add(new String(grid[0]));
        if(grid.length == 1)
            return result.toArray();
        for(int i = 1; i < grid.length-1; i++){
            char[] lolMinus = grid[i-1].toCharArray();
            char[] lol = grid[i].toCharArray();
            char[] lolPlus = grid[i+1].toCharArray();
            char cavity = '9';
            for(int j = 1; j < lol.length - 1; j++){
                if(lol[j-1] == 'X' || lolMinus[j] == 'X' || lolPlus[j] == 'X' )
                    continue;
                if(lol[j - 1] < lol[j] && lol[j + 1] < lol[j] && lolMinus[j] < lol[j] && lolPlus[j] < lol[j])
                    lol[j] = 'X';
            }
            result.add(new String(lol));
        }

        result.add(new String(grid[grid.length - 1]));
        return result.toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i = 0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        Object[] result = cavityMap(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
