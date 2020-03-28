package com.example.topcoder.leetcode.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class IsGraphBipartiteTest {

    private IsGraphBipartite isGraphBipartite;

    @BeforeMethod
    public void setup() {
        this.isGraphBipartite = new IsGraphBipartite();
    }

    @Test
    public void testIsBipartite0() throws Exception {
        //setup
        int[][] graph = new int[][]{
                {1, 2},
                {0,2},
                {0,1}
        };

        //test
        boolean result = this.isGraphBipartite.isBipartite(graph);

        //verify
        assertFalse(result);
    }

    @Test
    public void testIsBipartite1() throws Exception {
        //setup
        int[][] graph = new int[][]{
                {},
                {2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}
        };

        //test
        boolean result = this.isGraphBipartite.isBipartite(graph);

        //verify
        assertFalse(result);
    }

}