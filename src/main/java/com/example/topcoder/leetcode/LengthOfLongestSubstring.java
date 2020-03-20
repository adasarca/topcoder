package com.example.topcoder.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;

        while(start < n && end < n) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                if (end - start > max) {
                    max = end - start;
                }
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int start = 0, end = 0; end < n; end++) {
            Integer pos = map.get(s.charAt(end));
            if (pos != null && pos >= start) {
                start = pos + 1;
            }

            map.put(s.charAt(end), end);
            if (end - start + 1 > max) {
                max = end - start + 1;
            }
        }
        return max;
    }
}
