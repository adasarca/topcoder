package com.example.topcoder.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeMethod
    public void setup() {
        this.threeSum = new ThreeSum();
    }

    @Test
    public void testThreeSum0() throws Exception {
        //setup
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1, 0, 1)
        );

        //test
        List<List<Integer>> sums = this.threeSum.threeSum(nums);

        //verify
        assertEquals(sums, expected);
    }

    @Test
    public void testThreeSum1() throws Exception {
        //setup
        int[] nums = new int[]{-1, 0, 1, 2, -1, 1, 1, 1, -1, -1, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1, 0, 1)
        );

        //test
        List<List<Integer>> sums = this.threeSum.threeSum(nums);

        //verify
        assertEquals(sums, expected);
    }

}