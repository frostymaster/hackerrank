package com.frostmaster.algorithms.sorting.InsertionSortPart1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {

    static void insertionSort1(int n, int[] arr) {

        boolean isInserted=false;
        int unsortedval=-1;
        int unsortedindex=-1;
        for(int i=arr.length-1;i>0;i--){

            if(arr[i]<arr[i-1]){
                unsortedval=arr[i];
                unsortedindex=i;
                break;
            }

        }

        for(int i=unsortedindex;i>=0;i--){
            if(i>0 && arr[i-1]>=unsortedval){
                arr[i]=arr[i-1];
            }else{
                arr[i]=unsortedval;
                isInserted=true;
            }

            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }

            System.out.print("\n");

            if(isInserted)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }

    public static void printArray(int[] arr){
        Stream.of(arr).forEach(System.out::println);
    }

}
