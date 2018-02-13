package com.frostmaster.algorithms.implementation.TimeInWords;

import java.util.Scanner;

public class Solution {

    static void timeInWords(int h, int m) {
        String[] arr={ "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
                "twenty five",
                "twenty six",
                "twenty seven",
                "twenty eight",
                "twenty nine"};
        if(m==1)
        {
            System.out.print(arr[m]+" minute past "+arr[h]);
        }
        else if(m==30)
        {
            System.out.print("half past "+arr[h]);
        }
        else if(m==45||m==15)
        {
            System.out.print(m==45?"quarter to "+arr[h+1]:"quarter past "+arr[h]);
        }
        else if(m==00)
        {
            System.out.print(arr[h]+" o' clock")  ;
        }
        else
        {
            System.out.print(m<30?arr[m]+" minutes past "+arr[h]:arr[60-m]+" minutes to "+arr[h+1]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        timeInWords(h, m);
        in.close();
    }

}
