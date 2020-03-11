package com.example.topcoder.tree;

import com.example.topcoder.tree.WalkOverATree;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 3/11/2020
 */
public class WalkOverATreeTest {

    private WalkOverATree walkOverATree;

    @BeforeMethod
    public void setup() {
        this.walkOverATree = new WalkOverATree();
    }

    @Test
    public void testMaxNodesVisited0() {
        //setup
        int[] parent = new int[]{0,0};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 2);

        //verify
        assertEquals(nodes, 2);
    }

    @Test
    public void testMaxNodesVisited1() {
        //setup
        int[] parent = new int[]{0,0};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 3);

        //verify
        assertEquals(nodes, 3);
    }

    @Test
    public void testMaxNodesVisited2() {
        //setup
        int[] parent = new int[]{0,1,2,3};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 2);

        //verify
        assertEquals(nodes, 3);
    }

    @Test
    public void testMaxNodesVisited3() {
        //setup
        int[] parent = new int[]{0,0,0,0,2,4,2,3,1};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 1);

        //verify
        assertEquals(nodes, 2);
    }

    @Test
    public void testMaxNodesVisited4() {
        //setup
        int[] parent = new int[]{0,0,1,2,3,2,3,1,3,0,1,8,6,8,0,5,15,0,9};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 4);

        //verify
        assertEquals(nodes, 5);
    }

    @Test
    public void testMaxNodesVisited5() {
        //setup
        int[] parent = new int[]{0,0,0,1,1,3,5,1,4,5,2,2,10,5,10,10,11,13,8,3,18,15,20,20,23,8,11,26,4};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 26);

        //verify
        assertEquals(nodes, 17);
    }

    @Test
    public void testMaxNodesVisited6() {
        //setup
        int[] parent = new int[]{0, 0, 2, 0};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 100);

        //verify
        assertEquals(nodes, 5);
    }

    @Test
    public void testMaxNodesVisited7() {
        //setup
        int[] parent = new int[]{0,0,2};

        //test
        int nodes = this.walkOverATree.maxNodesVisited(parent, 4);

        //verify
        assertEquals(nodes, 4);
    }
}