package com.example.topcoder.leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (null == strs) return "";

        int n = strs.length;
        if (n == 0) return "";
        if (n == 1) return strs[0];

        int length = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < length) {
                length = str.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);

            boolean common = true;
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) != c) {
                    common = false;
                    break;
                }
            }
            if (!common) break;

            sb.append(c);
        }
        return sb.toString();
    }
}
