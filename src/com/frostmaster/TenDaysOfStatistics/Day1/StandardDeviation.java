package com.frostmaster.TenDaysOfStatistics.Day1;

import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
			numbers[i] = in.nextInt();
		}

		System.out.printf("%.1f", calculateStandartDeviation(numbers));

		in.close();
	}

	public static float calculateMean(int[] numbers){
		int sum = 0;
		float mean = 0;

		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}

		mean = (float)sum/numbers.length;

		return mean;
	}

	public static double calculateStandartDeviation(int[] numbers){
		float sum = 0;
		float mean = calculateMean(numbers);

		for(int i = 0; i < numbers.length; i++){
			sum += (numbers[i] - mean)*(numbers[i] - mean);
		}

		return Math.sqrt(sum/numbers.length);
	}

}
