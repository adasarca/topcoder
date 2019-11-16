package com.example.topcoder.sorting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingSubsetsTest {

    private SortingSubsets sortingSubsets;

    @BeforeMethod
    public void setup() {
        this.sortingSubsets = new SortingSubsets();
    }

    @Test
    public void testGetMinimalSize_Example0() throws Exception {
        //setup
        int[] a = new int[]{3, 2, 1};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 2);
    }

    @Test
    public void testGetMinimalSize_Example1() throws Exception {
        //setup
        int[] a = new int[]{1, 2, 3, 4};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 0);
    }

    @Test
    public void testGetMinimalSize_Example2() throws Exception {
        //setup
        int[] a = new int[]{4, 4, 4, 3, 3, 3};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 6);
    }

    @Test
    public void testGetMinimalSize_Example3() throws Exception {
        //setup
        int[] a = new int[]{11, 11, 49, 7, 11, 11, 7, 7, 11, 49, 11};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 7);
    }

    @Test
    public void testGetMinimalSize_SystemTest0() throws Exception {
        //setup
        int[] a = new int[]	{91, 37, 37, 37, 37, 91, 91, 29, 37, 91, 37, 29, 29, 37, 91, 29, 91, 37, 37, 29, 37, 91, 91, 91, 29, 29, 37, 37, 37, 91, 29, 37, 37, 91, 29, 91, 29};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 28);
    }

    @Test
    public void testGetMinimalSize_SystemTest1() throws Exception {
        //setup
        int[] a = new int[]{4, 81, 22, 33, 91, 54, 22, 84, 67, 16, 95, 100, 6, 71, 77, 97, 94, 35, 39, 36, 67, 4, 3, 3, 95, 28, 49, 98, 34, 95, 13, 73, 4, 72, 95, 50, 58, 4, 6, 36, 28, 36, 22, 4, 44, 95, 33, 71, 99, 50}	;

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 48);
    }

    @Test
    public void testGetMinimalSize_SystemTest2() throws Exception {
        //setup
        int[] a = new int[]{40, 16, 19, 84, 72, 50, 99, 10, 1, 4, 100, 60, 57, 34, 78, 93, 54, 38, 81, 90}	;

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 19);
    }

    @Test
    public void testGetMinimalSize_SystemTest3() throws Exception {
        //setup
        int[] a = new int[]{32, 2, 34, 71, 46, 16, 75, 57, 99, 50, 49}	;

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 9);
    }

    @Test
    public void testGetMinimalSize_SystemTest4() throws Exception {
        //setup
        int[] a = new int[]	{100, 14, 3, 64, 79, 70, 91, 30, 72, 28, 25, 89, 2, 5, 78, 37, 40, 73, 81, 23, 9, 57, 93, 4, 82, 41, 98, 80, 67, 11, 94, 44, 1, 50, 52, 18, 22, 15, 16};

        //test
        int r = this.sortingSubsets.getMinimalSize(a);

        //verify
        assertEquals(r, 38);
    }

}