package com.frostmaster.algorithms.CutTheSticks;

import java.util.Scanner;

public class Solution {

    static int[] cutTheSticks(int[] arr) {
        int min = -1;
        while (min != -2){
            int cut = 0;
            min = getMin(arr);
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0)
                    continue;
                arr[i] = arr[i] - min;
                cut++;
            }
            if(cut != 0)
                System.out.println(cut);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
          //  System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

    static int getMin(int[] arr){
        int min = -2;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                continue;
            if(min > arr[i] || min < 0)
                min = arr[i];
        }
        return min;
    }

}
