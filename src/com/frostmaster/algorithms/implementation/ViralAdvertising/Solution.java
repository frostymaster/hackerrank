package com.frostmaster.algorithms.implementation.ViralAdvertising;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int recieve = 5;
        int count = 0;
        for(int i = 0; i < n; i++){
            int recieved = 0;
            recieved = recieve / 2;
            recieve = recieved * 3;
            count = count + recieved;
        }

        System.out.println(count);
    }

}
