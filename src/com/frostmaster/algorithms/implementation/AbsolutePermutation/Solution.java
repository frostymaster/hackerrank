package com.frostmaster.algorithms.implementation.AbsolutePermutation;

import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            if(k == 0){
                for(int i = 1; i <= n; i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                continue;
            }

            if((n/k) % 2 != 0){
                System.out.println("-1");
                continue;
            }

            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i = 1; i <= n; i++){
                boolean flag = false;
                int pos = i - k;
                if(pos >= 1 && pos <= n && map.get(pos) == null){
                    map.put(pos, i);
                    flag = true;
                }
                else{
                    pos = i + k;
                    if(pos >= 1 && pos <= n && map.get(pos) == null){
                        map.put(pos, i);
                        flag = true;
                    }
                }
                if(!flag)
                    break;
            }
            if(map.size() != n){
                System.out.println("-1");
            }
            else{
                for(int val :map.values()) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

}
