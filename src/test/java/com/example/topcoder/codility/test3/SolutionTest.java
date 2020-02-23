package com.example.topcoder.codility.test3;

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
        int res = this.solution.solution(268);

        //verify
        assertEquals(res, 5268);
    }

    @Test
    public void testSolution1() throws Exception {
        //test
        int res = this.solution.solution(0);

        //verify
        assertEquals(res, 50);
    }

    @Test
    public void testSolution2() throws Exception {
        //test
        int res = this.solution.solution(-999);

        //verify
        assertEquals(res, -5999);
    }

    @Test
    public void testSolution3() throws Exception {
        //test
        int res = this.solution.solution(537);

        //verify
        assertEquals(res, 5537);
    }

    @Test
    public void testSolution4() throws Exception {
        //test
        int res = this.solution.solution(-1);

        //verify
        assertEquals(res, -15);
    }

    @Test
    public void testSolution5() throws Exception {
        //test
        int res = this.solution.solution(1);

        //verify
        assertEquals(res, 51);
    }

    @Test
    public void testSolution6() throws Exception {
        //test
        int res = this.solution.solution(9876543);

        //verify
        assertEquals(res, 98765543);
    }

    @Test
    public void testSolution7() throws Exception {
        //test
        int res = this.solution.solution(-9876543);

        //verify
        assertEquals(res, -59876543);
    }

    @Test
    public void testSolution8() throws Exception {
        //test
        int res = this.solution.solution(3456789);

        //verify
        assertEquals(res, 53456789);
    }

    @Test
    public void testSolution9() throws Exception {
        int n = -3456789;

        //test
        int res = this.solution.solution(n);

        //verify
        assertEquals(res, -34556789);
    }

    @Test
    public void testSolution10() throws Exception {
        //test
        int res = this.solution.solution(6);

        //verify
        assertEquals(res, 65);
    }

    @Test
    public void testSolutio11() throws Exception {
        //test
        int res = this.solution.solution(-6);

        //verify
        assertEquals(res, -56);
    }

}