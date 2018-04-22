package com.frostmaster.WeekOfCode37.SuperiorCharacters;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	static long maximumSuperiorCharacters(int[] freq) {
		long length = Arrays.stream(freq).sum();
		long maxChars = (length - 1) / 2;

		long charsUpToLimitLevelCount = 0;
		int limitLevel = 0;
		for (; charsUpToLimitLevelCount <= length - maxChars && limitLevel < freq.length; ++limitLevel) {
			charsUpToLimitLevelCount += freq[limitLevel];
		}

		long supAtLimitLevel = maxChars + charsUpToLimitLevelCount - length;
		charsUpToLimitLevelCount -= freq[--limitLevel];

		long unmatchedSupCount = Math.min(supAtLimitLevel, Math.max(charsUpToLimitLevelCount - 1, 0));
		return maxChars - (supAtLimitLevel - unmatchedSupCount);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int[] freq = new int[26];

			String[] freqItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int freqItr = 0; freqItr < 26; freqItr++) {
				int freqItem = Integer.parseInt(freqItems[freqItr]);
				freq[freqItr] = freqItem;
			}

			long result = maximumSuperiorCharacters(freq);

	//		bufferedWriter.write(String.valueOf(result));
	//		bufferedWriter.newLine();
		}

	//	bufferedWriter.close();

		scanner.close();
	}

}
