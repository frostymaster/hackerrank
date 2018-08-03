package com.frostmaster.algorithms.arrays.NewYearChaos;

import static java.lang.Math.max;

public class Solution {

    static void minimumBribes(int[] q) {
        int sum = 0;
        for(int i = q.length - 1; i >= 0; i--){
            if(q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) sum++;
        }
        System.out.println(sum);
    }

}
