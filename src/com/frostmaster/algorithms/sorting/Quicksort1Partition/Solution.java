package com.frostmaster.algorithms.sorting.Quicksort1Partition;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        equal.add(pivot);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < pivot)
                left.add(arr[i]);
            else if (arr[i] == pivot)
                equal.add(arr[i]);
            else
                right.add(arr[i]);

        }


        for(int i=0;i<left.size();i++)
            System.out.print(left.get(i)+" ");
        for(int i=0;i<equal.size();i++)
            System.out.print(equal.get(i)+" ");

        for(int i=0;i<right.size();i++)
            System.out.print(right.get(i)+" ");

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        System.out.println("");


        in.close();
    }

}
