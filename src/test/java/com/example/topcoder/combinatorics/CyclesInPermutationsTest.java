package com.example.topcoder.combinatorics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CyclesInPermutationsTest {

    private CyclesInPermutations cyclesInPermutations;

    @BeforeMethod
    public void init() {
        this.cyclesInPermutations = new CyclesInPermutations();
    }

    @Test
    public void testMaxCycle0() throws Exception {
        //setup
        int[] board = new int[]{3, 2, 4, 1, 6, 5};

        //test
        int max = this.cyclesInPermutations.maxCycle(board);

        //verify
        assertEquals(max, 3);
    }

    @Test
    public void testMaxCycle1() throws Exception {
        //setup
        int[] board = new int[]{5,7,14,6,16,10,8,17,11,12,18,3,4,13,2,15,9,1,20,19};

        //test
        int max = this.cyclesInPermutations.maxCycle(board);

        //verify
        assertEquals(max, 11);
    }

    @Test
    public void testMaxCycle2() throws Exception {
        //setup
        int[] board = new int[]{13, 28, 3, 12, 26, 48, 30, 32, 4, 47, 5, 25, 36, 22, 1, 16, 50, 39, 18, 31, 9, 35, 11, 43, 34, 42, 29, 45, 41, 10, 49, 14, 19, 24, 44, 15, 33, 37, 38, 46, 23, 2, 8, 7, 17, 40, 21, 6, 20, 27};

        //test
        int max = this.cyclesInPermutations.maxCycle(board);

        //verify
        assertEquals(max, 18);
    }

    @Test
    public void testMaxCycle3() throws Exception {
        //setup
        int[] board = new int[]{7, 43, 23, 42, 17, 27, 4, 11, 30, 1, 50, 18, 49, 10, 46, 12, 31, 19, 21, 9, 41, 33, 24, 39, 47, 40, 14, 15, 38, 5, 32, 22, 13, 20, 26, 6, 29, 3, 44, 45, 36, 8, 35, 34, 16, 37, 2, 25, 28, 48};

        //test
        int max = this.cyclesInPermutations.maxCycle(board);

        //verify
        assertEquals(max, 27);
    }

}