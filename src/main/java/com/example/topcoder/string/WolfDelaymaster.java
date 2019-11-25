/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
package com.example.topcoder.string;

public class WolfDelaymaster {

    public String check(String str) {
        int n = str.length();
        int i = 0;
        while (i < n) {
            int[] count = new int[4];
            while (i < n && str.charAt(i) == 'w') {
                count[0]++;
                i++;
            }
            while (i < n && str.charAt(i) == 'o') {
                count[1]++;
                i++;
            }
            while (i < n && str.charAt(i) == 'l') {
                count[2]++;
                i++;
            }
            while (i < n && str.charAt(i) == 'f') {
                count[3]++;
                i++;
            }
            if (count[0] != count[1] || count[0] != count[2] || count[0] != count[3]) {
                return "INVALID";
            }
        }
        return "VALID";
    }

    public String check2(String str) {
        String invalid = "INVALID";
        int n = str.length();
        if (str.charAt(n - 1) != 'f') {
            return invalid;
        }

        char[] chars = new char[]{'w', 'o', 'l', 'f'};
        int c = 0, wCount = 0, count = 0;
        int i = 0;
        while (i < n) {
            if (str.charAt(i) != chars[c]) {
                return invalid;
            }

            if (c == 0) {
                wCount = 0;
                do {
                    wCount++;
                    i++;
                } while (i < n && str.charAt(i) == chars[c]);
                c++;
                continue;
            }

            count  = 0;
            do {
                count++;
                i++;
            } while (i < n && str.charAt(i) == chars[c]);
            if (count != wCount) {
                return invalid;
            }
            c = c < 3 ? c + 1 : 0;
        }
        return "VALID";
    }
}
