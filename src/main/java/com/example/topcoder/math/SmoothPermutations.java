/*
 * Created by AdelaSarca
 * Date: 2/10/2020
 */
package com.example.topcoder.math;

public class SmoothPermutations {

    public long countPermutations(int t, int m, int mx, int seed, int[] prefN, int[] prefK, int[] prefX) {
        long[] a = new long[3 * t];
        a[0] = seed;
        for (int i = 1; i < 3 * t; i++) {
            a[i] = (a[i - 1] * 1103515245 + 12345) % 2147483648L;
        }

        int n[] = new int[t];
        int k[] = new int[t];
        int x[] = new int[t];

        int len = prefN.length;
        for (int i = 0; i < len; i++) {
            n[i] = prefN[i];
            k[i] = prefK[i];
            x[i] = prefX[i];
        }
        for (int i = len; i < t; i++) {
            n[i] = (int)(a[i] % mx) + 1;
            k[i] = (int)(a[t + i] % n[i]) + 1;
            x[i] = (int)(a[2 * t + i] % n[i]) + 1;
        }

        long sum = 0;
        for (int i = 0; i < t; i++) {
            sum += this.countPermutations(n[i], k[i], x[i], m);
        }
        return sum;
    }

    private long countPermutations(int n, int k, int x, int m) {
        if (x < k) {
            return 0;
        }

        long result = 1;

        for (int i = x; i > x - k; i--) {
            result = (result * (i % m)) % m;
        }
        for (int i = n - k; i > 1; i--) {
            result = (result * (i % m)) % m;
        }
        return result;
    }
}
