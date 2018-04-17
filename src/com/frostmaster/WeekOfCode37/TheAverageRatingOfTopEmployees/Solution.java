package com.frostmaster.WeekOfCode37.TheAverageRatingOfTopEmployees;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	// Complete the averageOfTopEmployees function below.
	static void averageOfTopEmployees(int[] rating) {
		ArrayList<Integer> employees = new ArrayList<>();

		double avarageSum = 0;
		double size = 0;

		for(int i = 0; i < rating.length; i++){
			if(rating[i] >= 90) {
				size++;
				avarageSum += rating[i];
			}
		}


		double result = avarageSum / size;

		System.out.println(String.format("%.2f", result));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] rating = new int[n];

		for (int ratingItr = 0; ratingItr < n; ratingItr++) {
			int ratingItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			rating[ratingItr] = ratingItem;
		}

		averageOfTopEmployees(rating);

		scanner.close();
	}

}
