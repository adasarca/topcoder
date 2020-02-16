package com.example.topcoder.math;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThePermutationGameDiv2Test {

    private ThePermutationGameDiv2 thePermutationGameDiv2;

    @BeforeMethod
    public void init() {
        this.thePermutationGameDiv2 = new ThePermutationGameDiv2();
    }

    @Test
    public void testFindMin0() throws Exception {
        //test
        long min = this.thePermutationGameDiv2.findMin(25);

        //verify
        assertEquals(min, 26771144400L);
    }

}