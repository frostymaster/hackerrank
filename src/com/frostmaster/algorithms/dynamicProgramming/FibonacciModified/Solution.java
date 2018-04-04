package com.frostmaster.algorithms.dynamicProgramming.FibonacciModified;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    static BigInteger fibonacciModified(int t1, int t2, int n) {
        Integer number1 = t1;
        BigInteger number1Big = new BigInteger(number1.toString());
        Integer number2 = t2;
        BigInteger number2Big = new BigInteger(number2.toString());
        BigInteger temp = new BigInteger("0");
        for(int i=3;i<=n;i++){
            temp = number2Big;
            number2Big = number2Big.multiply(number2Big);
            number2Big = number2Big.add(number1Big);
            number1Big = temp;
        }
        return number2Big;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result.toString());
        in.close();
    }

}
