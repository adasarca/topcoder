/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.sorting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CostOfDancingTest {

    private CostOfDancing costOfDancing;

    @BeforeMethod
    public void setup() {
        this.costOfDancing = new CostOfDancing();
    }

    @Test
    public void testMinimum_Example0() {
        //setup
        int k = 2;
        int[] danceCost = new int[] {1, 5, 3, 4};

        //test
        int cost = this.costOfDancing.minimum(k, danceCost);

        //verify
        assertEquals(cost, 4);
    }

    @Test
    public void testMinimum_Example1() {
        //setup
        int k = 3;
        int[] danceCost = new int[] {1, 5, 4};

        //test
        int cost = this.costOfDancing.minimum(k, danceCost);

        //verify
        assertEquals(cost, 10);
    }

    @Test
    public void testMinimum_Example2() {
        //setup
        int k = 1;
        int[] danceCost = new int[] {2, 2, 4, 5, 3};

        //test
        int cost = this.costOfDancing.minimum(k, danceCost);

        //verify
        assertEquals(cost, 2);
    }

    @Test
    public void testMinimum_Example3() {
        //setup
        int k = 39;
        int[] danceCost = new int[] {973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794, 913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
                703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801};

        //test
        int cost = this.costOfDancing.minimum(k, danceCost);

        //verify
        assertEquals(cost, 20431);
    }

    @Test
    public void testMinimum_OneCourse() {
        //setup
        int k = 1;
        int[] danceCost = new int[] {5};

        //test
        int cost = this.costOfDancing.minimum(k, danceCost);

        //verify
        assertEquals(cost, 5);
    }
}