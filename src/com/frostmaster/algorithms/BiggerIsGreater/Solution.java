package com.frostmaster.algorithms.BiggerIsGreater;

import java.util.Scanner;

public class Solution {

    static String biggerIsGreater(String w) {

        boolean swapFlag = false;

        if(w.length() == 1)
            return "no answer";


        char[] charArr = w.toCharArray();
        if(w.length() == 2)
            if(charArr[0] < charArr[1]){
                char temp = charArr[0];
                charArr[0] = charArr[1];
                charArr[1] = temp;
                return new String(charArr);
            } else if((charArr[0] == charArr[1]) || charArr[0] > charArr[1])
                return "no answer";
            else
                return w;


        int unchagedPos = w.length() - 1;

        while(unchagedPos > 0 && charArr[unchagedPos - 1] >= charArr[unchagedPos])
            unchagedPos--;

        if(unchagedPos == 0)
            return "no answer";

        int pivot = w.length() - 1;
        while(charArr[pivot] <= charArr[unchagedPos - 1])
            pivot--;

        char temp = charArr[unchagedPos - 1];
        charArr[unchagedPos - 1] = charArr[pivot];
        charArr[pivot] = temp;


        for(int i = w.length() - 1; i >= unchagedPos; i--){
            for(int j = i; j >= unchagedPos; j--){
                if(charArr[j] > charArr[i]){
                    temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }

        return new String(charArr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            String w = in.next();
            String result = biggerIsGreater(w);
            System.out.println(result);
        }
        in.close();
    }

}
