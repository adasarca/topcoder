package com.example.topcoder.combinatorics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 2/17/2020
 */
public class LittleElephantAndPermutationDiv2Test {

    private LittleElephantAndPermutationDiv2 littleElephantAndPermutationDiv2;

    @BeforeMethod
    public void setup() {
        this.littleElephantAndPermutationDiv2 = new LittleElephantAndPermutationDiv2();
    }

    @Test
    public void testGetNumber0() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(1, 1);

        //verify
        assertEquals(result, 1);
    }

    @Test
    public void testGetNumber1() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(3, 8);

        //verify
        assertEquals(result, 18);
    }

    @Test
    public void testGetNumber2() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(2, 1);

        //verify
        assertEquals(result, 4);
    }

    @Test
    public void testGetNumber3() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(10, 47);

        //verify
        assertEquals(result, 13168189440000L);
    }

    @Test
    public void testGetNumber4() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(10, 60);

        //verify
        assertEquals(result, 13164284851200L);
    }

    @Test
    public void testGetNumber5() {
        //test
        long result = this.littleElephantAndPermutationDiv2.getNumber(2, 100);

        //verify
        assertEquals(result, 0);
    }
}