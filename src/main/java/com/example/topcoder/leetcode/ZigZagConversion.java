/*
 * Created by AdelaSarca
 * Date: 3/20/2020
 */
package com.example.topcoder.leetcode;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows > n) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int j = 0;
        boolean increase = false;
        for (int i = 0; i < n; i++) {
            rows[j].append(s.charAt(i));

            if (j == 0 || j == numRows - 1) {
                increase = !increase;
            }
            j += increase ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
