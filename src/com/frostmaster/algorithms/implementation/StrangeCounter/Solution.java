package com.frostmaster.algorithms.implementation.StrangeCounter;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong(), n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        System.out.println((3 * (n - 1) - t + 1));
    }

}
