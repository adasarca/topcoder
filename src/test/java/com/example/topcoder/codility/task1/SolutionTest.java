package com.example.topcoder.codility.task1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    private Solution solution;

    @BeforeMethod
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void testSolution0() throws Exception {
        //test
        int count = this.solution.solution(1, 8, 3, 2);

        //verify
        assertEquals(count, 6);
    }

    @Test
    public void testSolution1() throws Exception {
        //test
        int count = this.solution.solution(9, 8, 7, 5);

        //verify
        assertEquals(count, 0);
    }

    @Test
    public void testSolution2() throws Exception {
        //test
        int count = this.solution.solution(1, 2, 2, 1);

        //verify
        assertEquals(count, 6);
    }

    @Test
    public void testSolution3() throws Exception {
        //test
        int count = this.solution.solution(1, 0, 2, 3);

        //verify
        assertEquals(count, 18);
    }

}