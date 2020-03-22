package com.example.topcoder.leetcode.combinatorics;

import java.util.*;

public class GenerateParantheses {

    public List<String> generateParenthesis2(int n) {
        if (n < 1) return Collections.singletonList("");

        ArrayList<LinkedList<String>> dp = new ArrayList<>(n + 1);
        LinkedList<String> list = new LinkedList<>();
        list.add("");
        dp.add(list);

        for (int i = 1; i <= n; i++) {
            list = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                for (String s1 : dp.get(j)) {
                    for (String s2 : dp.get(i - j - 1)) {
                        list.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dp.add(list);
        }
        return dp.get(n);
    }

    public List<String> generateParenthesis(int n) {
        if (n == 0) return Collections.singletonList("");

        List<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (String left : generateParenthesis(i)) {
                for (String right : generateParenthesis(n - i - 1)) {
                    list.add("(" + left + ")" + right);
                }
            }
        }
        return list;
    }
}
