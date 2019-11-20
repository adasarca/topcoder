package com.example.topcoder.math;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/20/2019
 */
public class EmoticonsDiv2Test {

    private EmoticonsDiv2 emoticonsDiv2;

    @BeforeMethod
    public void setup() {
        this.emoticonsDiv2 = new EmoticonsDiv2();
    }

    @Test
    public void testPrintSmiles_Example0() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(2);

        //verify
        assertEquals(seconds, 2);
    }

    @Test
    public void testPrintSmiles_Example1() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(6);

        //verify
        assertEquals(seconds, 5);
    }

    @Test
    public void testPrintSmiles_Example2() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(11);

        //verify
        assertEquals(seconds, 11);
    }

    @Test
    public void testPrintSmiles_Example3() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(16);

        //verify
        assertEquals(seconds, 8);
    }

    @Test
    public void testPrintSmiles_Example4() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(1000);

        //verify
        assertEquals(seconds, 21);
    }

    @Test
    public void testPrintSmiles_SystemTest0() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(32);

        //verify
        assertEquals(seconds, 10);
    }

    @Test
    public void testPrintSmiles_SystemTest1() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(123);

        //verify
        assertEquals(seconds, 44);
    }

    @Test
    public void testPrintSmiles_SystemTest2() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(699);

        //verify
        assertEquals(seconds, 236);
    }

    @Test
    public void testPrintSmiles_SystemTest3() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(994);

        //verify
        assertEquals(seconds, 80);
    }

    @Test
    public void testPrintSmiles_SystemTest4() {
        //test
        int seconds = this.emoticonsDiv2.printSmiles(971);

        //verify
        assertEquals(seconds, 971);
    }
}