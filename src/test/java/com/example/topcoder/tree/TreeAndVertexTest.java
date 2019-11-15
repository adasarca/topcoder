/*
 * Created by Adela.Sarca
 * Date: 11/15/2019
 */
package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TreeAndVertexTest {

    private TreeAndVertex treeAndVertex;

    @BeforeMethod
    public void setup() {
        this.treeAndVertex = new TreeAndVertex();
    }

    @Test
    public void testGet_Example0() {
        //test
        int components = this.treeAndVertex.get(new int[]{0,0,0});

        //verify
        assertEquals(components, 3);
    }

    @Test
    public void testGet_Example1() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 1, 2, 3});

        //verify
        assertEquals(components, 2);
    }

    @Test
    public void testGet_Example2() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 0, 2, 2});

        //verify
        assertEquals(components, 3);
    }

    @Test
    public void testGet_Example3() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 0, 0, 1, 1, 1});

        //verify
        assertEquals(components, 4);
    }

    @Test
    public void testGet_Example4() {
        //test
        int components = this.treeAndVertex.get(new int[]
                {0, 1, 2, 0, 1, 5, 6, 1, 7, 4, 2, 5, 5, 8, 6, 2, 14, 12, 18, 10, 0, 6, 18, 2, 20, 11, 0, 11, 7, 12, 17, 3, 18, 31, 14, 34, 30, 11, 9});

        //verify
        assertEquals(components, 5);
    }

    @Test
    public void testGet_SystemTest4() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 0});

        //verify
        assertEquals(components, 2);
    }

    @Test
    public void testGet_SystemTest5() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 1});

        //verify
        assertEquals(components, 2);
    }

    @Test
    public void testGet_SystemTest6() {
        //test
        int components = this.treeAndVertex.get(new int[]{0});

        //verify
        assertEquals(components, 1);
    }

    @Test
    public void testGet_SystemTest7() {
        //test
        int components = this.treeAndVertex.get(new int[]{0, 0, 1, 2, 0, 0, 3, 5, 5, 0, 2, 2, 5, 8, 5, 7, 5, 0, 13, 2, 19, 12, 2, 0, 10, 23, 14, 3, 28, 1, 2, 9, 8, 1, 18, 27, 36, 30, 16, 30, 2, 19, 21, 33, 30, 13, 38, 40, 33, 36, 20, 0, 25, 49, 41, 32, 27, 43, 34});

        //verify
        assertEquals(components, 8);
    }

    @Test
    public void testGet_SystemTest12() {
        //test
        int components = this.treeAndVertex.get(new int[]	{0, 1, 2, 0, 0, 2, 6, 7, 5, 6, 5, 5, 3, 12, 7, 10, 6, 5, 12, 1, 13, 12, 16, 8, 5, 17, 12, 11, 2, 29, 9, 7, 16, 32, 20, 3, 24, 3, 37, 24, 19, 6, 29, 36, 20, 15, 41, 28, 17, 28, 36, 36, 22, 15, 44, 29, 32, 36, 57, 59, 17, 21, 61, 6, 23, 15, 2, 54, 63, 16, 61, 68, 5, 60, 69, 18, 41, 47, 28, 76, 4, 59, 64, 76, 36, 74, 1, 41, 49, 29, 88, 8, 32, 36, 21, 53, 45, 54, 5});

        //verify
        assertEquals(components, 8);
    }

    @Test
    public void testGet_SystemTest13() {
        //test
        int components = this.treeAndVertex.get(new int[]	{0, 1, 2, 1, 1, 0, 2, 2, 8, 3, 4, 7, 7, 3, 4, 2, 3, 14, 17, 17, 8, 6, 16, 2, 20, 12, 13, 25, 25, 14, 3, 3, 27, 27, 33, 22, 9, 31, 8, 12, 13, 15, 2, 15, 13, 4, 25, 1, 0, 26, 41, 20, 35, 1, 2, 15, 46, 56, 56, 54, 27, 44, 18, 23, 38, 14, 36, 41, 27, 65, 3, 46, 19, 59, 28, 53, 28, 65, 55, 50, 71, 24, 49, 9, 63, 5, 36, 17, 60, 13, 16, 15, 58, 45, 70, 78, 2, 56, 66});

        //verify
        assertEquals(components, 9);
    }

    @Test
    public void testGet_SystemTest16() {
        //test
        int components = this.treeAndVertex.get(new int[]	{0, 0, 2, 1, 2, 2, 1, 6, 3, 7, 0, 6, 1, 13, 12, 4, 5, 1, 17, 7, 2, 14, 18, 6, 12, 18, 22, 26, 27, 13, 22, 23, 4, 13, 5, 28, 2, 34, 19, 1, 13, 2, 9, 41, 33, 6, 45, 3, 26, 46, 30, 39, 24, 21, 42, 11, 41, 42, 25, 27, 42, 43, 6, 11, 5, 27, 19, 17, 38, 46, 65, 53, 33, 36, 52, 23, 68, 67, 70, 11, 0, 74, 77, 18, 66, 76, 84, 76, 12, 58, 83, 31, 80, 70, 61, 3, 47, 37, 96});

        //verify
        assertEquals(components, 7);
    }
}