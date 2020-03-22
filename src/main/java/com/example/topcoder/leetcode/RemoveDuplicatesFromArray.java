package com.example.topcoder.leetcode;

public class RemoveDuplicatesFromArray {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int l = 0, r = 1;
        while(r < n) {
            if (nums[r] != nums[r - 1]) {
                nums[++l] = nums[r];
            }
            r++;
        }
        return l + 1;
    }
}
