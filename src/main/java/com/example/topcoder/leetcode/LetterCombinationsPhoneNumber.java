package com.example.topcoder.leetcode;

import java.util.*;

public class LetterCombinationsPhoneNumber {
    private List<String> output;
    private String[] strings;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0) return Collections.emptyList();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        this.strings = new String[n];
        for (int i = 0; i < n; i++) {
            this.strings[i] = map.get(digits.charAt(i) - '0');
        }

        char[] comb = new char[n];
        this.output = new LinkedList<>();
        this.generate(0, comb);
        return this.output;
    }

    private void generate(int i, char[] comb) {
        if (i == this.strings.length) {
            this.output.add(new String(comb));
            return;
        }

        int n = this.strings[i].length();
        for (int k = 0; k < n; k++) {
            comb[i] = this.strings[i].charAt(k);
            this.generate(i + 1, comb);
        }
    }
}
