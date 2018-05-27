package com.frostmaster.WorldCodeSprint13.FindTheAbsentStudents;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the findTheAbsentStudents function below.
    static ArrayList<Integer> findTheAbsentStudents(int n, int[] a) {

        Arrays.sort(a);

        ArrayList<Integer> result = new ArrayList<>();

        int[] temp = new int[n+1];

        for(int i = 0; i < n; i++){
            temp[a[i]]++;
        }

        for(int i = 1; i <= n; i++){
            if(temp[i] == 0){
                result.add(i);
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        ArrayList<Integer> result = findTheAbsentStudents(n, a);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
