package com.frostmaster.algorithms.strings.Pangrams;

import java.util.Scanner;

public class Solution {

    public static void main(String args[] ) throws Exception {
        Scanner in= new Scanner(System.in);
        String s = in.nextLine();
        int letters[] = new int[26];
        boolean isAnagram = true;
        s = s.toLowerCase();
        for(int i = 0;i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
                letters[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(letters[i] < 1)
            {
                isAnagram = false;
                System.out.print("not pangram");
                break;
            }
        }
        if(isAnagram)
        {
            System.out.print("pangram");
        }
    }

}
