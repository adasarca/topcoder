package com.example.topcoder.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestPalindromeTest {

    private LongestPalindrome solution;

    @BeforeMethod
    public void setup() {
        this.solution = new LongestPalindrome();
    }

    @Test
    public void testLongestPalindrome0() throws Exception {
        //setup
        String s = "babad";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "aba");
    }

    @Test
    public void testLongestPalindrome1() throws Exception {
        //setup
        String s = "";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "");
    }

    @Test
    public void testLongestPalindrome2() throws Exception {
        //setup
        String s = "abcdefg";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "a");
    }

    @Test
    public void testLongestPalindrome3() throws Exception {
        //setup
        String s = "abcddefg";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "dd");
    }

    @Test
    public void testLongestPalindrome4() throws Exception {
        //setup
        String s = "abcdcba";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "abcdcba");
    }

    @Test
    public void testLongestPalindrome5() throws Exception {
        //setup
        String s = "abcddcba";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "abcddcba");
    }

    @Test
    public void testLongestPalindrome6() throws Exception {
        //setup
        String s = "abcddcbaefghijkllkjihgfe";

        //test
        String substring = this.solution.longestPalindrome(s);

        //verify
        assertEquals(substring, "efghijkllkjihgfe");
    }

}