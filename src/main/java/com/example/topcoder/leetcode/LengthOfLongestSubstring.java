package com.example.topcoder.leetcode;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;

        while(end < n) {
            while(end < n && !set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
            }

            int length = end - start;
            if (length > max) {
                max = length;
            }

            if (end < n) {
                while(s.charAt(start) != s.charAt(end)) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
                end++;
            }
        }
        return max;
    }
}
