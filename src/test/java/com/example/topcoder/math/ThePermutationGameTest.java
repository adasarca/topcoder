package com.example.topcoder.math;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThePermutationGameTest {

    private ThePermutationGame thePermutationGame;

    @BeforeMethod
    public void setup() {
        this.thePermutationGame = new ThePermutationGame();
    }

    @Test
    public void testFindMin0() throws Exception {
        //test
        int min = this.thePermutationGame.findMin(11);

        //verify
        assertEquals(min, 27720);
    }

    @Test
    public void testFindMin1() throws Exception {
        //test
        int min = this.thePermutationGame.findMin(9999);

        //verify
        assertEquals(min, 927702802);
    }

    @Test
    public void testFindMin2() throws Exception {
        //test
        int min = this.thePermutationGame.findMin(19414);

        //verify
        assertEquals(min, 63013446);
    }

    @Test
    public void testFindMin3() throws Exception {
        //test
        int min = this.thePermutationGame.findMin(100000);

        //verify
        assertEquals(min, 59814054);
    }

    @Test
    public void testFindMin4() throws Exception {
        //test
        int min = this.thePermutationGame.findMin(577);

        //verify
        assertEquals(min, 970663088);
    }

}