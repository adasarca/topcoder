package com.example.topcoder.dp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FibonacciDiv2Test {

    private FibonacciDiv2 fibonacciDiv2;

    @BeforeMethod
    public void setup() {
        this.fibonacciDiv2 = new FibonacciDiv2();
    }

    @Test
    public void testFind1() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(1);

        //verify
        assertEquals(steps, 0);
    }

    @Test
    public void testFind2() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(13);

        //verify
        assertEquals(steps, 0);
    }

    @Test
    public void testFind3() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(15);

        //verify
        assertEquals(steps, 2);
    }

    @Test
    public void testFind4() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(19);

        //verify
        assertEquals(steps, 2);
    }

    @Test
    public void testFind5() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(1000000);

        //verify
        assertEquals(steps, 167960);
    }

    @Test
    public void testFind6() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(567876);

        //verify
        assertEquals(steps, 53647);
    }

    @Test
    public void testFind7() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(125784);

        //verify
        assertEquals(steps, 4391);
    }

    @Test
    public void testFind8() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(190039);

        //verify
        assertEquals(steps, 6379);
    }

    @Test
    public void testFind9() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(127);

        //verify
        assertEquals(steps, 17);
    }

    @Test
    public void testFind10() throws Exception {
        //test
        int steps = this.fibonacciDiv2.find(9);

        //verify
        assertEquals(steps, 1);
    }

}