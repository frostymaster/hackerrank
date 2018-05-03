package com.frostmaster.algorithms.strings.Anagram;

import java.util.Scanner;

public class Solution {

    static int anagram(String s){
        int len = s.length(), count = 0;
        if (len%2!=0){
            return -1;
        }
        String s1 = s.substring(0,len/2);
        String s2 = s.substring(len/2,len);
        char[] s1Chars = s1.toCharArray();
        for (char c : s1Chars){
            int index = s2.indexOf(c);
            if (index == -1){
                count++;
            } else {
                s2 = s2.substring(0,index)+s2.substring(index+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }

}
