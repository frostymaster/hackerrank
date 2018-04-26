package com.frostmaster.TenDaysOfStatistics.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class InterquartileRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] elements = new int[n];
		for (int i = 0; i < n; i++) {
			elements[i] = sc.nextInt();
		}

		int overall = 0;
		int[] freq = new int[n];
		for (int i = 0; i < n; i++) {
			freq[i] = sc.nextInt();
			overall += freq[i];
		}

		int [] finalResult = new int[overall];

		int dataIndex = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < freq[i]; j++) {
				finalResult[dataIndex] = elements[i];
				dataIndex++;
			}
		}

		Arrays.sort(finalResult);

		double q1 = findMedian(finalResult, 0, finalResult.length / 2 - 1);
		double q3 = findMedian(finalResult, (finalResult.length + 1) / 2, finalResult.length - 1);

		System.out.println(q3 - q1);

	}

	private static double findMedian(int [] array, int start, int end) {
		if ((end - start) % 2 == 0) { // odd number of elements
			return (array[(end + start) / 2]);
		} else { // even number of elements
			int value1 = array[(end + start) / 2];
			int value2 = array[(end + start) / 2 + 1];
			return (value1 + value2) / 2.0;
		}
	}

}
