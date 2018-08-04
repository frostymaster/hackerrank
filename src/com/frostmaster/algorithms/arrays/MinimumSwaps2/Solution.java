package com.frostmaster.algorithms.arrays.MinimumSwaps2;

import java.util.Arrays;

public class Solution {

    private static int minimumSwaps(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length;) {
            if (arr[i] == (i + 1) || arr[i] >= arr.length) {
                i++;
                continue;
            }

            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;

            count++;
        }

        return count;
    }

}
