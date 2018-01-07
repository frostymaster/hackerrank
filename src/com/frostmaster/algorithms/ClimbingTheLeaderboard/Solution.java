package com.frostmaster.algorithms.ClimbingTheLeaderboard;

import java.util.Scanner;
import static java.util.Arrays.binarySearch;
import static java.util.stream.IntStream.range;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int posToMinus = 0;
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }

        int[] array = range(0, n).map(i -> scores[n - i - 1]).distinct().toArray();
        int index = 0;
        for (int score : alice) {
            index = binarySearch(array, index < 0 ? 0 : index, array.length, score);
            if (index < 0) index = -index - 2;
            System.out.println(array.length - index);

        }
    }

}
