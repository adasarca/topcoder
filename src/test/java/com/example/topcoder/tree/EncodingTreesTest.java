package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 2/7/2020
 */
public class EncodingTreesTest {

    private EncodingTrees encodingTrees;

    @BeforeMethod
    public void setup() {
        this.encodingTrees = new EncodingTrees();
    }

    @Test
    public void testGetCode0() {
        //setup
        String expected = "ab";

        //test
        String code = this.encodingTrees.getCode(2, 1);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode1() {
        //setup
        String expected = "ba";

        //test
        String code = this.encodingTrees.getCode(2, 2);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode2() {
        //setup
        String expected = "";

        //test
        String code = this.encodingTrees.getCode(2, 3);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode3() {
        //setup
        String expected = "cbad";

        //test
        String code = this.encodingTrees.getCode(4, 9);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode4() {
        //setup
        String expected = "abcdeohgfniljkm";

        //test
        String code = this.encodingTrees.getCode(15, 14023);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode5() {
        //setup
        String expected = "jebadcihgfsrqponmkl";

        //test
        String code = this.encodingTrees.getCode(19, 883631594);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode6() {
        //setup
        String expected = "arbnhcgfedilkjmqop";

        //test
        String code = this.encodingTrees.getCode(18, 100000000);

        //verify
        assertEquals(code, expected);
    }

    @Test
    public void testGetCode7() {
        //setup
        String expected = "sbachdfegirlkjqmonp";

        //test
        String code = this.encodingTrees.getCode(19, 1423434232);

        //verify
        assertEquals(code, expected);
    }
}