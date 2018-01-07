package com.frostmaster.algorithms.DesignerPDFViewer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        int length = word.length();
        int max = 0;

        for(int i = 0; i < length; i++){
            char tempChar = word.charAt(i);
            if(max < h[tempChar - 97])
                max = h[tempChar - 97];
        }

        System.out.println(length * max);
    }

}
