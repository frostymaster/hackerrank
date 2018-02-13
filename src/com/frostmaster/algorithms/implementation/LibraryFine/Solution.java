package com.frostmaster.algorithms.implementation.LibraryFine;

import java.util.Scanner;

public class Solution {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int daysExpired = d1 - d2;
        int monthsExpired = m1 - m2;
        int yearExpired = y1 - y2;

        if(((d1 + m1 * 30 + y1 * 365) - (d2 + m2 * 30 + y2 * 365)) < 0)
            return 0;

        if(y1 > y2)
            return yearExpired * 10000;

        if(m1 > m2)
            return monthsExpired * 500;

        else
            return daysExpired * 15;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        in.close();
    }

}
