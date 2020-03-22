package com.example.topcoder.leetcode.combinatorics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class FourSumTest {

    private FourSum fourSum;

    @BeforeMethod
    public void setup() {
        this.fourSum = new FourSum();
    }

    @Test
    public void testFourSum() throws Exception {
        //setup
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2,  0, 0, 2),
                Arrays.asList(-1,  0, 0, 1)
        );

        //test
        List<List<Integer>> comb = this.fourSum.fourSum(nums, 0);

        //verify
        assertEquals(comb, expected);
    }

}