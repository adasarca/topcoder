package com.example.topcoder.leetcode.combinatorics;

import java.util.*;

public class FourSum {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> numbers;
    private int target;

    private Integer[] comb;
    private List<List<Integer>> output;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 4) return Collections.emptyList();

        this.map = new HashMap<>();
        this.numbers = new ArrayList<>();
        for (int x : nums) {
            Integer count = this.map.get(x);
            if (count == null) {
                count = 0;
                this.numbers.add(x);
            }
            this.map.put(x, count + 1);
        }
        Collections.sort(this.numbers);
        this.target = target;

        this.comb = new Integer[4];
        this.output = new LinkedList<>();
        this.generate(0, 0, 0);
        return this.output;
    }

    private void generate(int i, int j, int sum) {
        if (i == 3) {
            int x = this.target - sum;
            if (x >= this.comb[i - 1] && this.map.getOrDefault(x, 0) > 0) {
                this.comb[i] = x;
                List<Integer> list = new LinkedList<>();
                Collections.addAll(list, this.comb);
                this.output.add(list);
            }
            return;
        }

        int m = this.numbers.size();
        for (int k = j; k < m; k++) {
            Integer x = this.numbers.get(k);
            this.comb[i] = x;

            Integer count = this.map.get(x);
            int nextJ = count > 1 ? k : k + 1;
            this.map.put(x, count - 1);

            this.generate(i + 1, nextJ, sum + x);

            this.map.put(x, count);
        }
    }
}
