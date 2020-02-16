package com.example.topcoder.math;

public class ThePermutationGameDiv2 {

    public long findMin(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * (i / this.gcd(result, i));
        }
        return result;
    }

    private long gcd(long a, long b) {
        long r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
