package com.example.topcoder.leetcode;

public class CoupledHoldingHands {

    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[row[i]] = i;
        }

        int swaps = 0;
        for (int i = 0; i < n - 1; i += 2) {
            int next = row[i] % 2 == 0 ? row[i] + 1 : row[i] - 1;

            if (row[i + 1] != next) {
                int p = pos[next];
                row[p] = row[i + 1];
                row[i + 1] = next;

                pos[next] = i + 1;
                pos[row[p]] = p;
                swaps++;
            }
        }
        return swaps;
    }
}
