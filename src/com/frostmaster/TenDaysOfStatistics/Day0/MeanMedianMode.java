package com.frostmaster.TenDaysOfStatistics.Day0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MeanMedianMode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];
		double sum = 0;
		double median = 0;

		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
			sum += (double) arr[i];
		}

		double mean = sum / n;

		Arrays.sort(arr);

		if(n % 2 == 0){
			double medianSum = (double) arr[n / 2] + (double) arr[(n / 2) - 1];
			median = medianSum / 2;
		}
		else{
			median = arr[n / 2] / 2;
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		int maxOccurrences = 0;
		int mode = Integer.MAX_VALUE;
		for (int num : arr) {
			map.merge(num, 1, Integer::sum);
			int occurrences = map.get(num);
			if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
				maxOccurrences = occurrences;
				mode = num;
			}
		}

		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
	}

}
