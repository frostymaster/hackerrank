package com.frostmaster.WeekOfCode38.MinuteToWinIt;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static int minuteToWinIt(int[] a, int k) {

        int max = 0;

        HashMap<Integer, Integer> root = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            int result = a[i] - k * (i + 1);
            if(root.containsKey(result)){
                Integer oldValue = root.get(result);
                oldValue++;
                root.put(result, oldValue);
            } else {
                root.put(result, 1);
            }
        }

        for(Integer values : root.values()) {
            if(values > max)
                max = values;
        }

        return a.length - max;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minuteToWinIt(a, k);


        scanner.close();
    }

}
