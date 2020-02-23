package com.example.topcoder.codility.task1;

import java.util.Arrays;


/*
* Given 4 digits, count how many valid times exist with those digits (00:00 - 23:59)
*/
public class Solution {

    public int solution(int A, int B, int C, int D) {
        int[] p = new int[4];
        p[0] = A;
        p[1] = B;
        p[2] = C;
        p[3] = D;
        Arrays.sort(p);

        int count = 0;
        do {
            if (this.isValid(p)) {
                count++;
            }
        } while (this.nextPermutation(p));
        return count;
    }

    private boolean isValid(int[] p) {
        if (p[0] > 2) return false;

        if (p[0] == 2 && p[1] > 3) return false;

        return p[2] < 6;
    }

    private boolean nextPermutation(int[] p) {
        int x = p.length - 2;
        while(x >= 0 && p[x] >= p[x + 1]) {
            x--;
        }

        if (x < 0) return false;

        int min = p.length - 1;
        while(p[min] <= p[x]) {
            min--;
        }

        this.swap(p, x, min);
        this.reverse(p, x + 1);
        return true;
    }

    private void swap(int[] p, int x, int y) {
        int aux = p[x];
        p[x] = p[y];
        p[y] = aux;
    }

    private void reverse(int p[], int x) {
        int y = p.length - 1;
        while(x < y) {
            this.swap(p, x++, y--);
        }
    }
}
