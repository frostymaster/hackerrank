package com.frostmaster.algorithms.implementation.OrganizingContainersOfBalls;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static String organizingContainers(int[][] container, int n) {
        HashMap<Integer, Integer> typesInBucket = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                if(typesInBucket.containsKey(container[i][j]))
                    typesInBucket.put(container[i][j], typesInBucket.get(container[i][j]) +1);
            else
                    typesInBucket.put(container[i][j], 1);

        }

        int max = 0;
        for(Integer got : typesInBucket.values()){
            if(max == 0) {
                max = got;
                continue;
            }
            if(max != got)
                return "Impossible";
        }

        return "Possible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    int x = in.nextInt();
                    a[i] += x;
                    b[j] += x;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b))
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }

}
