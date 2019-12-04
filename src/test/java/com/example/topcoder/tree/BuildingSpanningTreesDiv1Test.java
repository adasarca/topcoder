package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 12/3/2019
 */
public class BuildingSpanningTreesDiv1Test {

    private BuildingSpanningTreesDiv1 buildingSpanningTreesDiv1;

    @BeforeMethod
    public void setup() {
        this.buildingSpanningTreesDiv1 = new BuildingSpanningTreesDiv1();
    }

    @Test
    public void testGetNumberOfSpanningTrees0() {
        //setup
        int n = 3;
        int[] x = new int[]{1,2};
        int[] y = new int[]{2,3};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 1);
    }

    @Test
    public void testGetNumberOfSpanningTrees1() {
        //setup
        int n = 5;
        int[] x = new int[]{1,3,4};
        int[] y = new int[]{2,4,5};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 6);
    }

    @Test
    public void testGetNumberOfSpanningTrees2() {
        //setup
        int n = 4;
        int[] x = new int[]{1};
        int[] y = new int[]{2};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 8);
    }

    @Test
    public void testGetNumberOfSpanningTrees3() {
        //setup
        int n = 4;
        int[] x = new int[]{1,2,1};
        int[] y = new int[]{2,3,3};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 0);
    }

    @Test
    public void testGetNumberOfSpanningTrees4() {
        //setup
        int n = 8;
        int[] x = new int[]{1,4,2,3,5};
        int[] y = new int[]{4,7,6,5,8};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 144);
    }

    @Test
    public void testGetNumberOfSpanningTrees5() {
        //setup
        int n = 1000;
        int[] x = new int[]{1};
        int[] y = new int[]{2};

        //test
        int result = this.buildingSpanningTreesDiv1.getNumberOfSpanningTrees(n, x, y);

        //verify
        assertEquals(result, 529013784);
    }
}