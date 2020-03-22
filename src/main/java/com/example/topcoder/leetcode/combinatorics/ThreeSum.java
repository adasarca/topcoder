package com.example.topcoder.leetcode.combinatorics;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (null == nums) return Collections.emptyList();

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            Integer count = map.get(x);
            if (null == count) {
                list.add(x);
                count = 0;
            }
            map.put(x, count + 1);
        }
        Collections.sort(list);

        List<List<Integer>> res = new LinkedList<>();
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int x = list.get(i);

            int count = map.get(x);
            int next = count > 1 ? i : i + 1;
            map.put(x, count - 1);

            for (int j = next; j < n; j++) {
                int y = list.get(j);
                map.compute(y, (k,v) -> v - 1);

                int z = 0 - x - y;
                if (z >= y && map.getOrDefault(z, 0) > 0) {
                    List<Integer> sum = new LinkedList<>();
                    sum.add(x);
                    sum.add(y);
                    sum.add(z);
                    res.add(sum);
                }

                map.compute(y, (k,v) -> v + 1);
            }
            map.compute(x, (k,v) -> v + 1);
        }
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        if (null == nums) return Collections.emptyList();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            int count = map.getOrDefault(x, 0);
            map.put(x, count + 1);
        }
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            map.compute(nums[i], (k,v) -> v - 1);
            for (int j = i + 1; j < n - 1; j++) {
                map.compute(nums[j], (k,v) -> v - 1);

                int r = 0 - nums[i] - nums[j];
                if (r >= nums[j] && map.getOrDefault(r, 0) > 0) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(r);
                    res.add(list);
                }

                map.compute(nums[j], (k,v) -> v + 1);
                while(j < n - 1 && nums[j] == nums[j + 1]) j++;
            }
            map.compute(nums[i], (k,v) -> v + 1);
            while(i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        if (null == nums) return Collections.emptyList();

        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<List<Integer>>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                    }
                    while(k < n - 1 && nums[k] == nums[k + 1]) k++;
                }
                while(j < n - 1 && nums[j] == nums[j + 1]) j++;
            }
            while(i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }
}
