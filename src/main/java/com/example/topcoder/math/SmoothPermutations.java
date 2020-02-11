/*
 * Created by AdelaSarca
 * Date: 2/10/2020
 */
package com.example.topcoder.math;

public class SmoothPermutations {

    private long[] prodTree;
    private int maxN;

    public long countPermutations(int t, int m, int mx, int seed, int[] prefN, int[] prefK, int[] prefX) {
        //prep tests
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

        //init fact
        long[] fact = new long[mx + 2];
        fact[0] = 1;
        for (int i = 1; i <= mx + 1; i++) {
            fact[i] = (fact[i - 1] * (i % m)) % m;
        }

        //init segment tree
        this.maxN = mx;
        int size = 1;
        while(size <= this.maxN)
            size *= 2;
        this.prodTree = new long[2 * size];
        this.initProdTree(0, 0, this.maxN, m);

        //calculate
        long sum = 0;
        for (int i = 0; i < t; i++) {
            sum += this.countPermutations(n[i], k[i], x[i], m, fact);
        }
        return sum;
    }

    private long countPermutations(int n, int k, int x, int m, long[] fact) {
        if (k > x) {
            return 0;
        }

        return (this.getProduct(0, 0, maxN, x - k + 1, x, m) * fact[n - k]) % m;
    }

    private void initProdTree(int node, int l, int r, int modulo) {
        if (l == r) {
            prodTree[node] = l;
        } else {
            int m = (l + r) / 2;
            this.initProdTree(2 * node + 1, l, m, modulo);
            this.initProdTree(2 * node + 2, m + 1, r, modulo);
            prodTree[node] = (prodTree[2 * node + 1] * prodTree[2 * node + 2]) % modulo;
        }
    }

    private long getProduct(int node, int l, int r, int start, int end, int modulo) {
        if (start > end) return 1;
        if (start == l && end == r) return prodTree[node];

        int m = (l + r) / 2;
        long result = this.getProduct(2 * node + 1, l, m, start, Math.min(m, end), modulo);
        result *= this.getProduct(2 * node + 2, m + 1, r, Math.max(m + 1, start), end, modulo);
        return result % modulo;
    }
}
