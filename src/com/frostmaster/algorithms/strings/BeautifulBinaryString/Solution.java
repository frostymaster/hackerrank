package com.frostmaster.algorithms.strings.BeautifulBinaryString;

import java.util.Scanner;

public class Solution {

    static int beautifulBinaryString(String b) {
        String removeAllUglyThings = b.replaceAll("010", "");
        return (b.length() - removeAllUglyThings.length()) / 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }

}
