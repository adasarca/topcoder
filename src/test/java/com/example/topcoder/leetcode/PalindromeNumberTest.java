package com.example.topcoder.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeMethod
    public void setup() {
        this.palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void testIsPalindrome0() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(121);

        //verify
        assertTrue(res);
    }

    @Test
    public void testIsPalindrome1() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(1221);

        //verify
        assertTrue(res);
    }

    @Test
    public void testIsPalindrome2() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(0);

        //verify
        assertTrue(res);
    }

    @Test
    public void testIsPalindrome3() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(5);

        //verify
        assertTrue(res);
    }

    @Test
    public void testIsPalindrome4() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(78870);

        //verify
        assertFalse(res);
    }

    @Test
    public void testIsPalindrome5() throws Exception {
        //test
        boolean res = this.palindromeNumber.isPalindrome(-121);

        //verify
        assertFalse(res);
    }

}