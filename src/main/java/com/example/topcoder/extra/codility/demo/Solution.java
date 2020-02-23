package com.example.topcoder.extra.codility.demo;

import java.util.HashSet;

public class Solution {

    public int solution(int[] A) {

        HashSet<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        int n = 1;
        while (set.contains(n)) n++;
        return n;
    }

    public int solutionMisread(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int n = 1; n <= 100000; n++) {
            if (!set.contains(n)) {
                return n;
            }
        }
        return 0;
    }
}
