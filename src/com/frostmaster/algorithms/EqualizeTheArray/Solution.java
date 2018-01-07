package com.frostmaster.algorithms.EqualizeTheArray;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> values = new HashMap<>();
        Integer maxEntry = 0;
        for(int i = 0; i < arr.length; i++){
            if(values.containsKey(arr[i]))
                values.put(arr[i], values.get(arr[i]) + 1);
            else
                values.put(arr[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : values.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry) > 0)
            {
                maxEntry = entry.getValue();
            }
        }

        return arr.length - maxEntry;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }

}
