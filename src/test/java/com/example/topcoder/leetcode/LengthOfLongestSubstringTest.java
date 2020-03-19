package com.example.topcoder.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring solution;

    @BeforeMethod
    public void setup() {
        this.solution = new LengthOfLongestSubstring();
    }

    @Test
    public void testLengthOfLongestSubstring0() throws Exception {
        //test
        int length = this.solution.lengthOfLongestSubstring("abcabcbb");

        //verify
        assertEquals(length, 3);
    }

    @Test
    public void testLengthOfLongestSubstring1() throws Exception {
        //test
        int length = this.solution.lengthOfLongestSubstring("tmmzuxt");

        //verify
        assertEquals(length, 5);
    }

}