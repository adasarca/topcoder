/*
 * Created by AdelaSarca
 * Date: 2/6/2020
 */
package com.example.topcoder.tree;

public class EncodingTrees {

    public String getCode(int n, int index) {
        int[] count = new int[n + 1];
        count[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }
        if (index > count[n]) {
            return "";
        }

        return this.getCode(n, index, 'a', count);
    }

    private String getCode(int n, int index, char offset, int[] count) {
        if (n == 0) {
            return "";
        }

        int i = 0;
        while (index > count[i] * count[n - i - 1]) {
            index -= count[i] * count[n - i - 1];
            i++;
        }

        int leftCount = count[n - i - 1];
        int leftIndex = ((index - 1) / leftCount) + 1;
        int rightIndex = ((index - 1) % leftCount) + 1;

        return (char)(i + offset) +
                this.getCode(i, leftIndex, offset, count) +
                this.getCode(n - i - 1, rightIndex, (char)(offset + i + 1), count);
    }
}
