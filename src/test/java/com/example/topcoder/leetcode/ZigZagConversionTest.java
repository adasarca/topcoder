package com.example.topcoder.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 3/20/2020
 */
public class ZigZagConversionTest {

    private ZigZagConversion zigZagConversion;

    @BeforeMethod
    public void setup() {
        this.zigZagConversion = new ZigZagConversion();
    }

    @Test
    public void testConvert0() {
        //test
        String converted = this.zigZagConversion.convert("PAYPALISHIRING", 3);

        //verify
        assertEquals(converted, "PAHNAPLSIIGYIR");
    }

    @Test
    public void testConvert1() {
        //test
        String converted = this.zigZagConversion.convert("PAYPALISHIRING", 4);

        //verify
        assertEquals(converted, "PINALSIGYAHRPI");
    }

    @Test
    public void testConvert2() {
        //test
        String converted = this.zigZagConversion.convert("PAYPALISHIRING", 1);

        //verify
        assertEquals(converted, "PAYPALISHIRING");
    }

    @Test
    public void testConvert3() {
        //test
        String converted = this.zigZagConversion.convert("PAYPALISHIRING", 20);

        //verify
        assertEquals(converted, "PAYPALISHIRING");
    }
}