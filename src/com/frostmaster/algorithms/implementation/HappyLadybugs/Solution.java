package com.frostmaster.algorithms.implementation.HappyLadybugs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the happyLadybugs function below.
     */
    static String happyLadybugs(String b) {
        ArrayList<Integer> a = new ArrayList(26);int flag=0,unhappy=0,flag2=0;
        for(int j=0;j<26;j++){
            a.add(0);
        }

        for(int i=0;i<b.length();i++){
            unhappy=0;
            if(i!=0){//check if happy to the left
                if(b.charAt(i-1)!=b.charAt(i))
                    unhappy++;
            }else unhappy--;
            if(i!=b.length()-1){//check if happy to the right
                if(b.charAt(i)!=b.charAt(i+1))
                    unhappy++;
            }else unhappy--;
            if(unhappy==2 && !b.contains("_")){ flag=1;break;} //if unhappy both sides and no swap
            int ascii=b.charAt(i)-65;
            if(ascii >=0 && ascii<=25 ){
                a.set(ascii,a.get(ascii)+1);
            }
        }
        if(flag==1 || a.contains(1))return "NO";//if unhappy both sides and no swap or there is only 1 colored bee
        else return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
