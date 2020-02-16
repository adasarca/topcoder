package com.example.topcoder.math;

import java.util.Arrays;

public class ThePermutationGame {

    public int findMin(int n) {
        int mod = 1000000007;
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        long result = 1;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                long pow = i;
                while (pow * i <= n) {
                    pow *= i;
                }
                result = (result * (pow % mod)) % mod;

                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return (int)result;
    }
}
