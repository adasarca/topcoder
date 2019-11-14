/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.dp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThePalindromeTest {

    private ThePalindrome thePalindrome;

    @BeforeMethod
    public void setup() {
        this.thePalindrome = new ThePalindrome();
    }

    @Test
    public void testFind_Example0() {
        //test
        int length = this.thePalindrome.find("abab");

        //verify
        assertEquals(length, 5);
    }

    @Test
    public void testFind_Example1() {
        //test
        int length = this.thePalindrome.find("abacaba");

        //verify
        assertEquals(length, 7);
    }

    @Test
    public void testFind_Example2() {
        //test
        int length = this.thePalindrome.find("qwerty");

        //verify
        assertEquals(length, 11);
    }

    @Test
    public void testFind_Example3() {
        //test
        int length = this.thePalindrome.find("abdfhdyrbdbsdfghjkllkjhgfds");

        //verify
        assertEquals(length, 38);
    }

    @Test
    public void testFind_One() {
        //test
        int length = this.thePalindrome.find("x");

        //verify
        assertEquals(length, 1);
    }

    @Test
    public void testFind_TwoPal() {
        //test
        int length = this.thePalindrome.find("xx");

        //verify
        assertEquals(length, 2);
    }

    @Test
    public void testFind_ThreePal() {
        //test
        int length = this.thePalindrome.find("aha");

        //verify
        assertEquals(length, 3);
    }

    @Test
    public void testFind_FourPal() {
        //test
        int length = this.thePalindrome.find("abba");

        //verify
        assertEquals(length, 4);
    }
}