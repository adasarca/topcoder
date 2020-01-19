package com.example.topcoder.dp;

public class FibonacciDiv2 {

    public int find(int n) {
        int a = 0;
        int b = 1;
        while (n > b) {
            int c = a + b;
            a = b;
            b = c;
        }

        int r1 = n - a;
        int r2 = b - n;
        return Math.min(r1, r2);
    }
}
