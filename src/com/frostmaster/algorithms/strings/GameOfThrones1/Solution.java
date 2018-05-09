package com.frostmaster.algorithms.strings.GameOfThrones1;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    static String gameOfThrones(String s){
        String resultString = s;

        HashSet<Character> goodSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(goodSet.contains(s.charAt(i))){
                goodSet.remove(s.charAt(i));
            } else {
                goodSet.add(s.charAt(i));
            }
        }

        if(goodSet.size() == s.length() % 2){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }

}
