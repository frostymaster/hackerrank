package com.frostmaster.WeekOfCode37;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleLanguage {

	/*
     * Complete the maximumProgramValue function below.
     */
	static long maximumProgramValue(int n) {
		long max = 0L;
		long linesToRemove = 0;
		String[] things = new String[n];

		for(int i = 0;  i < n; i++){
			things[i] = scanner.nextLine();
			String[] line = things[i].split(" ");
			if(line[0].equals("set")){
				Integer value = Integer.parseInt(line[1]);
				if(value > max)
					max = value;
				else
					linesToRemove++;
			}
			if(line[0].equals("add")){
				Integer value = Integer.parseInt(line[1]);
				if(value + max > max)
					max += value;
				else
					linesToRemove++;
			}

		}

		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");



		long result = maximumProgramValue(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
