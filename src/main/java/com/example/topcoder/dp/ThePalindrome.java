/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.dp;

/*
* John and Brus are studying string theory at the university. Brus likes palindromes very much. A palindrome is a word that reads the same forward and backward.
* John would like to surprise Brus by taking a s, and appending 0 or more characters to the end of s to obtain a palindrome.
* He wants that palindrome to be as short as possible. Return the shortest possible length of a palindrome that John can generate.
*/

public class ThePalindrome {

    public int find(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        boolean pal[][] = new boolean[n][n];

        //initialize dp with palindromes of 1 and 2
        for (int i = 0; i < n - 1; i++) {
            pal[i][i] = true;
            if (chars[i] == chars[i + 1]) {
                pal[i][i + 1] = true;
            }
        }
        pal[n - 1][n - 1] = true;

        //search for longer palindromes
        for (int k = 2; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                int j = i + k;
                pal[i][j] = chars[i] == chars[j] && pal[i + 1][j - 1];
            }
        }

        int i = 0;
        while(!pal[i][n - 1]) {
            i++;
        }

        return n + i;
    }
}
