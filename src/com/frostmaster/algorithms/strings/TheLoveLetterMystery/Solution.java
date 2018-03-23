package com.frostmaster.algorithms.strings.TheLoveLetterMystery;

import java.util.Scanner;

public class Solution {

    static int theLoveLetterMystery(String s){
        int result = 0;
        String reverseString = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < (s.length() / 2); i++)
        {
            result += Math.abs(s.charAt(i) - reverseString.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }

}
