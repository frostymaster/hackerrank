package com.frostmaster.algorithms.AngryProfessor;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i= 0; i < t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            int didNotArrived= 0;
            for(int j = 0; j < n; j++){
                int arrival = in.nextInt();
                if(arrival > 0)
                    didNotArrived++;
            }
            if((n - didNotArrived) < k)
                System.out.println("YES");
            else
                System.out.println(("NO"));
        }
    }

}
