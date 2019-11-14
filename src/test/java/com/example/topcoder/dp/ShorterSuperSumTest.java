/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.dp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShorterSuperSumTest {

    private ShorterSuperSum shorterSuperSum;

    @BeforeMethod
    public void setup() {
        this.shorterSuperSum = new ShorterSuperSum();
    }

    @Test
    public void testCalculate_Example0() {
        //test
        int sum = this.shorterSuperSum.calculate(1, 3);

        //verify
        assertEquals(sum, 6);
    }

    @Test
    public void testCalculate_Example1() {
        //test
        int sum = this.shorterSuperSum.calculate(2, 3);

        //verify
        assertEquals(sum, 10);
    }

    @Test
    public void testCalculate_Example2() {
        //test
        int sum = this.shorterSuperSum.calculate(4, 10);

        //verify
        assertEquals(sum, 2002);
    }

    @Test
    public void testCalculate_Example3() {
        //test
        int sum = this.shorterSuperSum.calculate(10, 10);

        //verify
        assertEquals(sum, 167960);
    }

    @Test
    public void testCalculate_Minimum() {
        //test
        int sum = this.shorterSuperSum.calculate(1, 1);

        //verify
        assertEquals(sum, 1);
    }

    @Test
    public void testCalculate_Maximum() {
        //test
        int sum = this.shorterSuperSum.calculate(14, 14);

        //verify
        assertEquals(sum, 37442160);
    }
}