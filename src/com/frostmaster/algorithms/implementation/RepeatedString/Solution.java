package com.frostmaster.algorithms.implementation.RepeatedString;

import java.util.Scanner;

public class Solution {

    static long repeatedString(String s, long n) {
        long count =0;
        for(char c : s.toCharArray())
        if(c == 'a')
            count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count  ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }

}
