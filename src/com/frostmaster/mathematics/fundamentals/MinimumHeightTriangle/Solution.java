package com.frostmaster.mathematics.fundamentals.MinimumHeightTriangle;

import java.util.Scanner;

public class Solution {

    static double lowestTriangle(double base, double area){
        double height = 2 * (area / base);
        height = Math.ceil(height);
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextInt();
        double area = in.nextInt();
        double height = lowestTriangle(base, area);
        System.out.println((int)height);
    }

}
