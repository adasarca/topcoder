package com.example.topcoder.math;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 2/10/2020
 */
public class SmoothPermutationsTest {

    private SmoothPermutations smoothPermutations;

    @BeforeMethod
    public void setup() {
        this.smoothPermutations = new SmoothPermutations();
    }

    @Test
    public void testCountPermutations() {
        //setup
        int[] prefN = new int[]{5, 4};
        int[] prefK = new int[]{3, 2};
        int[] prefX = new int[]{5, 2};

        //test
        long count = this.smoothPermutations.countPermutations(3, 100, 5, 4, prefN, prefK, prefX);

        //verify
        assertEquals(count, 24);
    }
}