package com.frostmaster.algorithms.strings.AlternatingCharacters;

import java.util.Scanner;

public class Solution {

    static int alternatingCharacters(String s){
        char current = s.charAt(0);
        int toRemove = 0;
        for(int i = 1; i < s.length(); i++){
            if(current == s.charAt(i))
                toRemove++;
            else
                current = s.charAt(i);
        }

        return toRemove;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

}
