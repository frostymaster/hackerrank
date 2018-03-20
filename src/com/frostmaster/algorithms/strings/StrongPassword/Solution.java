package com.frostmaster.algorithms.strings.StrongPassword;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    static int minimumNumber(int n, String s) {
        int count = 0;

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");

        Matcher matcherDigit = patternDigit.matcher(s);
        Matcher matcherUpper = patternUpper.matcher(s);
        Matcher matcherLower = patternLower.matcher(s);
        Matcher matcherSpecial = patternSpecial.matcher(s);

        if (!matcherDigit.find()) {
            count++;
        }
        if (!matcherUpper.find()) {
            count++;
        }
        if (!matcherLower.find()) {
            count++;
        }
        if (!matcherSpecial.find()) {
            count++;
        }
        if ((count+s.length())<6) {
            count = count + 6-(count+s.length());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }

}
