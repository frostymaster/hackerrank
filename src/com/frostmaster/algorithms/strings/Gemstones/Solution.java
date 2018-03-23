package com.frostmaster.algorithms.strings.Gemstones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    static int gemstones(String[] arr) {
        Set<Character> result = new HashSet<Character>();
        for (char c : arr[1].toCharArray()) {
            result.add(Character.valueOf(c));
        }

        for (int i = 1; i < arr.length; i++) {
            Set<Character> temp = new HashSet<Character>();
            for (char c : arr[i].toCharArray()) {
                temp.add(Character.valueOf(c));
            }
            result.retainAll(temp);
        }

        return result.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }

}
