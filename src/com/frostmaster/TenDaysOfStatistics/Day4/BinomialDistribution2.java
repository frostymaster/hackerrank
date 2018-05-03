package com.frostmaster.TenDaysOfStatistics.Day4;

public class BinomialDistribution2 {

    public static void main(String[] args) {
        double p = 0.12;
        int    n = 10;

        double result = 0;
        for (int x = 0; x <= 2; x++) {
            result += binomial(n, x, p);
        }
        System.out.format("%.3f%n", result);

        result = 1 - binomial(n, 0, p) - binomial(n, 1, p);
        System.out.format("%.3f%n", result);
    }

    private static Double binomial(int n, int x, double p) {
        if (p < 0 || p > 1 || n < 0 || x < 0 || x > n) {
            return null;
        }
        return combinations(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    private static Long combinations(int n, int x) {
        if (n < 0 || x < 0 || x > n) {
            return null;
        }
        return factorial(n) / (factorial(x) * factorial(n - x));
    }

    private static Long factorial (int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }

}
