package com.frostmaster.algorithms.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = new BigInteger(Integer.toString(n));
        for(int i = n-1; i > 0; i--){
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }

        System.out.println(factorial);
    }

}
