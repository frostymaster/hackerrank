package com.frostmaster.algorithms.greedy.LuckBalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalLuck = 0;

        int numContests = in.nextInt();
        int maxLosses = in.nextInt();

        ArrayList<Integer>contestLucks = new ArrayList<>();

        for(int i = 0;i<numContests;i++){
            int currContestLuck = in.nextInt();
            int temp = in.nextInt();
            if(temp ==0)totalLuck+=currContestLuck;
            else contestLucks.add(currContestLuck);
        }

        Collections.sort(contestLucks);

        for(int i = 0;i<contestLucks.size();i++){
            if(i<contestLucks.size()-maxLosses)totalLuck-=contestLucks.get(i);
            else totalLuck +=contestLucks.get(i);
        }

        System.out.println(totalLuck);
    }
}
