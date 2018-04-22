package com.frostmaster.WeekOfCode37.DynamicLineIntersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static void dynamicLineIntersection(String[] strArr) {

		final List<String> lines   = new ArrayList<>();
		final List<Integer> queries = new ArrayList<>();


		for (String s: strArr) {
			if      (s.charAt(0) == '?') queries.add( lines.stream().mapToInt( l -> intersect(Integer.parseInt(s.substring(2)),l) ).sum());
			else if (s.charAt(0) == '+') lines.add(   s.substring(2));
			else if (s.charAt(0) == '-') lines.remove(s.substring(2));
		}
		int[] wow =  queries.stream().mapToInt( i -> i.intValue() ).toArray();

		for(int i = 0; i < wow.length; i++){
			System.out.println(wow[i]);
		}

	}

	public static int intersect(int q, String l) {
		int[] vars = Arrays.stream(l.split(" ")).mapToInt(Integer::parseInt).toArray();
		return (q-vars[1]) % vars[0] == 0 ? 1 : 0;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		String[] arr = new String[n];

		for(int i = 0; i < n; i++){
			arr[i] = scanner.nextLine();
		}

		dynamicLineIntersection(arr);

		scanner.close();
	}

}
