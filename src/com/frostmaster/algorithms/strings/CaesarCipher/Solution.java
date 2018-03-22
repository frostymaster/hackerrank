package com.frostmaster.algorithms.strings.CaesarCipher;

import java.util.Scanner;

public class Solution {

    static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); ++i) {
            sb.append(encryptChar(s.charAt(i), k));
        }

        return sb.toString();
    }

    private static char encryptChar(char c, int k) {
        if(!Character.isAlphabetic(c)) return c;
        int base = Character.isLowerCase(c) ? 'a' : 'A';
        return (char)((c + k - base) % 26 + base);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }

}
