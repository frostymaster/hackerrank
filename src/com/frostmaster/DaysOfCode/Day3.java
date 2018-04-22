package com.frostmaster.DaysOfCode;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double meal_cost = in.nextDouble();
		double tip_percent = in.nextInt();
		double tax_percent = in.nextInt();
		in.close();


		double tip = meal_cost * (tip_percent / 100);
		double tax = meal_cost * (tax_percent / 100);
		double totalCost = meal_cost + tip + tax;
		long totalCostRounded = Math.round(totalCost);

		System.out.print("The total meal cost is " + totalCostRounded +" dollars.");
	}

}
