package com.frostmaster.algorithms.implementation.AppendAndDelete;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        int needed = 0;

        if(s.equals(t)) {
            System.out.println("Yes");
            return;
        }


        for(int i = 0; i < s.length(); i++){
            if(i < t.length()){
                if(s.charAt(i) == t.charAt(i))
                    continue;
                if(s.length() > t.length()){
                    needed = s.length() - i + t.length() - i;
                    break;
                }
                else{
                    needed = t.length() - i + s.length() - i;
                    break;
                }
            }
            needed = s.length() - i + t.length() - i;
            break;
        }

        if(needed == k)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
