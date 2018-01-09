package com.frostmaster.algorithms.AcmIcpcTeam;

import java.util.Scanner;

public class Solution {

    static int[] acmTeam(String[] topic) {
        String result = "";
        Integer teams = 0;
        Integer max = 0;
        for(int i = 0; i < topic.length - 1; i++){
            for(int j = i + 1; j < topic.length; j++){
                Integer know = 0;
                for(int k = 0; k < topic[j].length(); j++){
                    if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1'){
                        know++;
                    }

                    if(know > max){
                        max = know;
                        teams = 1;
                    } else if(know == max)
                        teams++;
                }

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        Integer teams = 0;
        Integer max = -1;
        for(int i = 0; i < topic.length - 1; i++){
            for(int j = i + 1; j < topic.length; j++){
                Integer know = 0;
                for(int k = 0; k < topic[i].length(); k++){
                    if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1'){
                        know = know + 1;
                    }
                }
                if(know > max){
                    max = know;
                    teams = 1;
                } else if(know == max)
                    teams += 1;
            }
        }

        System.out.println(max);
        System.out.println(teams);

        in.close();
    }

}
