package com.frostmaster.ModifiedKaprekarNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static ArrayList<Integer> kaprekarNumbers(int p, int q) {
        ArrayList<Integer> foundNumbers = new ArrayList<>();
        for (int num = p; num <= q; num++) {
            long squared = (long) num * num; // multiplying 2 ints without typecast could cause overflow
            String str   = String.valueOf(squared);
            String left  = str.substring(0, str.length() / 2);
            String right = str.substring(str.length() / 2);
            int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
            int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
            if (numL + numR == num) {
                foundNumbers.add(num);
                }
            }
            return foundNumbers;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        ArrayList<Integer> result = kaprekarNumbers(p, q);
        int i = 0;
        if(result.size() > 0) {
            for (Integer resultNumber : result) {
                System.out.print(resultNumber + (i != result.size() ? " " : ""));
            }
        } else {
            System.out.println("INVALID RANGE");
        }
        System.out.println("");


        in.close();
    }

}
