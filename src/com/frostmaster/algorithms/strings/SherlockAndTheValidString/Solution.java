package com.frostmaster.algorithms.strings.SherlockAndTheValidString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] charSeq1 = new int[26];

        for(int i = 0; i < s.length(); i++){
            charSeq1[s.charAt(i)-97]++;
        }


        int possibleToRemove = 1;

        for(int i = 0; i < 25; i++){
            if(charSeq1[i] == charSeq1[i+1]){
                continue;
            } else {
                if(charSeq1[i+1] == 0 && charSeq1[i] != 0) {
                    continue;
                }
                if(possibleToRemove == 0){
                    return "NO";
                }

                if(Math.abs(charSeq1[i] - charSeq1[i+1]) == 1) {
                    if(charSeq1[i+1] > charSeq1[i]) {
                        charSeq1[i+1] = charSeq1[i+1] - 1;
                    } else {
                        charSeq1[i+1] = charSeq1[i+1] + 1;
                    }
                    possibleToRemove--;
                } else {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);


        scanner.close();
    }

}
