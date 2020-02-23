package com.example.topcoder.extra.codility.task2;

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
        //setup
        String S = "A2Le";
        String T = "2pL1";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertTrue(res);
    }

    @Test
    public void testSolution1() throws Exception {
        //setup
        String S = "a10";
        String T = "10a";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertTrue(res);
    }

    @Test
    public void testSolution2() throws Exception {
        //setup
        String S = "ba1";
        String T = "1Ad";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertFalse(res);
    }

    @Test
    public void testSolution3() throws Exception {
        //setup
        String S = "3x2x";
        String T = "8";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertFalse(res);
    }

    @Test
    public void testSolution4() throws Exception {
        //setup
        String S = "3x2x";
        String T = "";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertFalse(res);
    }

    @Test
    public void testSolution5() throws Exception {
        //setup
        String S = "100000a";
        String T = "100000b";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertFalse(res);
    }

    @Test
    public void testSolution6() throws Exception {
        //setup
        String S = "100000a";
        String T = "100000a";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertTrue(res);
    }

    @Test
    public void testSolution7() throws Exception {
        //setup
        String S = "100005a";
        String T = "100000cD4";

        //test
        boolean res = this.solution.solution(S, T);

        //verify
        assertTrue(res);
    }

}