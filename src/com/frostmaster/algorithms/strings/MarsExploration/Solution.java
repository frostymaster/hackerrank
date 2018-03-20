package com.frostmaster.algorithms.strings.MarsExploration;

import java.util.Scanner;

public class Solution {

    public static int marsExploration(String message) {
        String toCheck = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != toCheck.charAt(i % 3))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }

}
