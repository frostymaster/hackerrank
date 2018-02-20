package com.frostmaster.algorithms.implementation.FlatlandSpaceStations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int maxDistance = c[0];
        for(int i = 1; i < c.length; i++){
            int distance = (c[i] - c[i-1]) / 2;
            if(maxDistance < distance) maxDistance = distance;
        }
        int lastGap = (n-1) - c[c.length - 1];
        return (lastGap < maxDistance) ? maxDistance : lastGap;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }

}
