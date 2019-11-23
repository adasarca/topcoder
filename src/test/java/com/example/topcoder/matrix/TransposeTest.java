package com.example.topcoder.matrix;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TransposeTest {

    private Transpose transpose;

    @BeforeMethod
    public void setup() {
        this.transpose = new Transpose();
    }

    @Test
    public void testNumSwaps0() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(3,3);

        //verify
        assertEquals(swaps, 3);
    }

    @Test
    public void testNumSwaps1() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(2,3);

        //verify
        assertEquals(swaps, 3);
    }

    @Test
    public void testNumSwaps2() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(3,5);

        //verify
        assertEquals(swaps, 10);
    }

    @Test
    public void testNumSwaps3() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(50,50);

        //verify
        assertEquals(swaps, 1225);
    }

    @Test
    public void testNumSwaps4() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(49,51);

        //verify
        assertEquals(swaps, 2492);
    }

    @Test
    public void testNumSwaps5() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(99,100);

        //verify
        assertEquals(swaps, 9836);
    }

    @Test
    public void testNumSwaps6() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(100,98);

        //verify
        assertEquals(swaps, 9484);
    }

    @Test
    public void testNumSwaps7() throws Exception {
        //test
        int swaps = this.transpose.numSwaps(81,9);

        //verify
        assertEquals(swaps, 480);
    }


}