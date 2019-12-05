package com.example.topcoder.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 12/5/2019
 */
public class FirstCommonAncestorTest {

    private FirstCommonAncestor firstCommonAncestor;

    @BeforeMethod
    public void setup() {
        this.firstCommonAncestor = new FirstCommonAncestor();
    }

    @Test
    public void testFind0() {
        //setup
        int x = 1;
        int y = 6;
        Integer[][] family = {
                {1, 2, 3},
                {3, 4, 5},
                {9, 7, 10},
                {7, 4, 5},
                {6, 7, 8}
        };

        //test
        Integer ancestor = this.firstCommonAncestor.find(x, y, family);

        //verify
        assertEquals(ancestor, (Integer)4);
    }

    @Test
    public void testFind1() {
        //setup
        int x = 9;
        int y = 6;
        Integer[][] family = {
                {1, 2, 3},
                {3, 4, 5},
                {9, 7, 10},
                {7, 4, 5},
                {6, 7, 8}
        };

        //test
        Integer ancestor = this.firstCommonAncestor.find(x, y, family);

        //verify
        assertEquals(ancestor, (Integer)7);
    }

    @Test
    public void testFind2() {
        //setup
        int x = 1;
        int y = 10;
        Integer[][] family = {
                {1, 2, 3},
                {3, 4, 5},
                {9, 7, 10},
                {7, 4, 5},
                {6, 7, 8}
        };

        //test
        Integer ancestor = this.firstCommonAncestor.find(x, y, family);

        //verify
        assertNull(ancestor);
    }
}