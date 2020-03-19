package com.example.topcoder.leetcode;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }

        int count = 1;
        int start = 0;
        boolean[][] pal = new boolean[n][n];

        for (int i = 0; i < n - 1; i++) {
            pal[i][i] = true;
            if (s.charAt(i) == s.charAt(i + 1)) {
                pal[i][i + 1] = true;
                count = 2;
                start = i;
            }
        }
        pal[n - 1][n - 1] = true;

        for (int k = 2; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                if (s.charAt(i) == s.charAt(i + k) && pal[i + 1][i + k - 1]) {
                    pal[i][i + k] = true;
                    count = k + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + count);
    }
}
