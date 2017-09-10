package com.frostmaster.algorithms.MinMaxSum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        long min = 0;
        long max = 0;
        int sum = 0;

        int maxPosition = 0;
        int minPosition = 0;

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > arr[maxPosition])
                maxPosition = arr_i;
            if(arr[arr_i] < arr[minPosition])
                minPosition = arr_i;

            sum += arr[arr_i];
        }

       for(int i = 0; i < 5; i++){
            if(i != maxPosition)
                max += arr[i];
            if(i != minPosition)
                min += arr[i];
       }

        System.out.print(max + " " + min);
    }
}

