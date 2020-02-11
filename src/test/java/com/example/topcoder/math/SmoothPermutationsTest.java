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
    public void testCountPermutations0() {
        //setup
        int[] prefN = new int[]{5, 4};
        int[] prefK = new int[]{3, 2};
        int[] prefX = new int[]{5, 2};

        //test
        long count = this.smoothPermutations.countPermutations(3, 100, 5, 4, prefN, prefK, prefX);

        //verify
        assertEquals(count, 24);
    }

    @Test
    public void testCountPermutations1() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(100, 999999937, 123456, 47, prefN, prefK, prefX);

        //verify
        assertEquals(count, 24359438587L);
    }

    @Test
    public void testCountPermutations2() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 943000708, 57, 1325036361, prefN, prefK, prefX);

        //verify
        assertEquals(count, 41176897745236L);
    }

    @Test
    public void testCountPermutations3() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 753310108, 469, 1928629837, prefN, prefK, prefX);

        //verify
        assertEquals(count, 37702474326341L);
    }

    @Test
    public void testCountPermutations4() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 43907464, 875, 1302095207, prefN, prefK, prefX);

        //verify
        assertEquals(count, 2204709091593L);
    }

    @Test
    public void testCountPermutations5() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 779585491, 179485, 1972415379, prefN, prefK, prefX);

        //verify
        assertEquals(count, 39082409489051L);
    }

    @Test
    public void testCountPermutations6() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 132087832, 196889, 1443565557, prefN, prefK, prefX);

        //verify
        assertEquals(count, 6628638927976L);
    }

    @Test
    public void testCountPermutations7() {
        //setup
        int[] prefN = new int[]{};
        int[] prefK = new int[]{};
        int[] prefX = new int[]{};

        //test
        long count = this.smoothPermutations.countPermutations(200000, 439621046, 191873, 231297767, prefN, prefK, prefX);

        //verify
        assertEquals(count, 22014794496001L);
    }
}