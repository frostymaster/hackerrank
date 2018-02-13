package com.frostmaster.algorithms.implementation.BeautifulTriplets;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int result = 0;
        HashSet<Integer> numbers = new HashSet<>();
        for(int arr_i = 0; arr_i < n; arr_i++){
            int num = in.nextInt();
            if (numbers.contains(num - d) && numbers.contains(num - 2 * d)) {
                result++;
            }
            numbers.add(num);
        }
        System.out.println(result);
        in.close();
    }

}
