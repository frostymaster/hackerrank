package com.frostmaster.algorithms.BeautifulDaysAtTheMovies;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        int numOfDays = 0;

        for(int day = i; day <= j; day++) {
            int reversed = reverseInt(day);
            if(Math.abs(day - reversed) % k == 0)
                numOfDays++;
        }


        System.out.println(numOfDays);
    }

    public static int reverseInt(int input)
    {
        long reversedNum = 0;

        long input_long = input;

        while (input_long != 0)
        {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
        {
            throw new IllegalArgumentException();
        }
        return (int)reversedNum;
    }

}
