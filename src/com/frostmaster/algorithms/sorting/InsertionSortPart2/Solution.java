package com.frostmaster.algorithms.sorting.InsertionSortPart2;

import java.util.Scanner;

public class Solution {

    static void insertionSort2(int n, int[] arr) {
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }

            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }

}
