/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.dp;

public class ThePalindrome {

    public int find(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        boolean pal[][] = new boolean[n][n];

        for (int i = 0; i < n - 1; i++) {
            pal[i][i] = true;
            pal[i+1][i] = true;
        }
        pal[n-1][n-1] = true;

        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                int j = i + k;
                pal[i][j] = chars[i] == chars[j] && pal[i+1][j-1];
            }
        }

        int i = 0;
        while(!pal[i][n - 1]) {
            i++;
        }

        return n + i;
    }
}
