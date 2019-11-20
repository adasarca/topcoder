package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/20/2019
 */
public class CellRemovalTest {

    private CellRemoval cellRemoval;

    @BeforeMethod
    public void setup() {
        this.cellRemoval = new CellRemoval();
    }

    @Test
    public void testCellsLeft0() {
        //setup
        int[] parent = new int[]{-1,0,0,1,1};
        int deletedCell = 2;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 2);
    }

    @Test
    public void testCellsLeft1() {
        //setup
        int[] parent = new int[]{-1,0,0,1,1};
        int deletedCell = 1;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 1);
    }

    @Test
    public void testCellsLeft2() {
        //setup
        int[] parent = new int[]{-1,0,0,1,1};
        int deletedCell = 0;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 0);
    }

    @Test
    public void testCellsLeft3() {
        //setup
        int[] parent = new int[]{-1,0,0,2,2,4,4,6,6};
        int deletedCell = 4;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 2);
    }

    @Test
    public void testCellsLeft4() {
        //setup
        int[] parent = new int[]{26,2,32,36,40,19,43,24,30,13,21,14,24,21,19,4,30,10,44,12,7,32,17,43,
                35,18,7,36,10,16,5,38,35,4,13,-1,16,26,1,12,2,5,18,40,1,17,38,44,14};
        int deletedCell = 24;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 14);
    }

    @Test
    public void testCellsLeft5() {
        //setup
        int[] parent = new int[]{24, 42, 4, 30, 29, 43, 22, 15, 26, 36, 26, 16, 3, 22, 21, 41, 18, 16, 34, 41, 12, 29, 32, 30, 43, 15, 4, 38, 36, -1, 24, 42, 18, 6, 21, 38, 6, 17, 32, 17, 3, 34, 12, 14, 14};
        int deletedCell = 24;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 17);
    }

    @Test
    public void testCellsLeft6() {
        //setup
        int[] parent = new int[]{26, 29, -1, 1, 2, 26, 15, 31, 20, 5, 29, 25, 4, 20, 25, 2, 3, 3, 27, 32, 6, 1, 14, 5, 32, 4, 14, 31, 6, 12, 27, 12, 15};
        int deletedCell = 6;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 14);
    }

    @Test
    public void testCellsLeft7() {
        //setup
        int[] parent = new int[]{32, 19, 7, 17, 27, 34, 1, 6, 2, 2, 21, 30, 5, 9, 19, 7, 6, -1, 33, 31, 30, 27, 9, 28, 16, 16, 24, 33, 38, 28, 5, 3, 21, 1, 17, 31, 24, 32, 34, 38, 3};
        int deletedCell = 22;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 20);
    }

    @Test
    public void testCellsLeft8() {
        //setup
        int[] parent = new int[]{19, 15, 18, 0, 16, 24, 29, 39, 11, 29, 19, 23, 35, 10, 37, 14, 30, 36, 26, 41, 24, 11, 33, 26, 39, 37, 14, 32, 33, 18, 25, 4, 36, 23, 35, 15, 10, -1, 4, 41, 30, 25, 16, 32, 0};
        int deletedCell = 2;

        //test
        int cells = this.cellRemoval.cellsLeft(parent, deletedCell);

        //verify
        assertEquals(cells, 22);
    }
}