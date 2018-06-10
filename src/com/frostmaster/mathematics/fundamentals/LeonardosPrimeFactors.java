package com.frostmaster.mathematics.fundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeonardosPrimeFactors {

    static int primeCount(long n) {
        long primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
        int count = 0;
        long pf = primes[0];
        for(int j = 1; j < primes.length && pf <= n && n != 1; j++){
            pf = pf * primes[j];
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
