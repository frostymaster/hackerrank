package com.frostmaster.algorithms.sorting.FindTheMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < N; i++){
			arr.add(sc.nextInt());
		}
		int element = N/2;
		Collections.sort(arr);
		System.out.println(""+arr.get(element));
	}

}
