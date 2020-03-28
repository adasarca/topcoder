package com.example.topcoder.leetcode.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;

public class MinimumHeightTreesTest {

    private MinimumHeightTrees minimumHeightTrees;

    @BeforeMethod
    public void setup() {
        this.minimumHeightTrees = new MinimumHeightTrees();
    }

    @Test
    public void testFindMinHeightTrees0() throws Exception {
        //setup
        int[][] edges = new int[][] {};

        //test
        List<Integer> roots = this.minimumHeightTrees.findMinHeightTrees(5, edges);

        //verify
        assertEquals(roots, Collections.emptyList());
    }

}