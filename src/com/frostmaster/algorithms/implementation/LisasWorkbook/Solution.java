package com.frostmaster.algorithms.implementation.LisasWorkbook;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        int sp = 0;
        int noOfPages = 0;
        for(int i=0;i<n;i++){
            int chpProb = sc.nextInt();
            int pgNo = noOfPages+1;
            int count = 0;
            for(int j=1;j<=chpProb;j++){
                if(j==pgNo)
                    sp++;
                if(j%cap==0 && j<chpProb){
                    pgNo++;
                }
            }
            noOfPages=pgNo;
        }
        System.out.println(sp);
    }

}
