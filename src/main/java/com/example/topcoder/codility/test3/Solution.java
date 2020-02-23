package com.example.topcoder.codility.test3;

/*
* Given int N, calculate maximum number that can be obtained by inserting digit 5
*/
public class Solution {

    public int solution(int N) {
        boolean pos = true;
        if (N < 0) {
            pos = false;
            N = -1 * N;
        }

        int d = 1;
        while (N > d * 10) d *= 10;

        int m = 0;
        while(d > 0) {
            int digit = N / d;
            N = N % d;

            if (this.isValid(digit, pos)) {
                m = this.addDigit(m, 5);
                m = this.addDigit(m, digit);
                m = m * d + N;
                return pos ? m : -1 * m;
            }

            m = this.addDigit(m, digit);
            d /= 10;
        }
        m = this.addDigit(m, 5);
        return pos ? m : -1 * m;
    }

    private int addDigit(int m, int digit) {
        return m * 10 + digit;
    }

    private boolean isValid(int x, boolean pos) {
        if (pos) {
            return x < 5;
        } else {
            return x > 5;
        }
    }
}
