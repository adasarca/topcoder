package com.example.topcoder.leetcode.combinatorics;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if (n < 3) return 0;

        Arrays.sort(nums);
        int sum = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int s = nums[i] + nums[j] + nums[k];
                    if (s == target) {
                        return s;
                    }

                    int d = Math.abs(target - s);
                    if (d < diff) {
                        sum = s;
                        diff = d;
                    }
                    while(k < n - 1 && nums[k] == nums[k + 1]) k++;
                }
                while(j < n - 1 && nums[j] == nums[j + 1]) j++;
            }
            while(i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return sum;
    }
}
