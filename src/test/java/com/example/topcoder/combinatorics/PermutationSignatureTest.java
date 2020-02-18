package com.example.topcoder.combinatorics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 2/18/2020
 */
public class PermutationSignatureTest {

    private PermutationSignature permutationSignature;

    @BeforeMethod
    public void setup() {
        this.permutationSignature = new PermutationSignature();
    }

    @Test
    public void testReconstruct0() {
        //setup
        String signature = "IIIII";
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct1() {
        //setup
        String signature = "DI";
        int[] expected = new int[]{2, 1, 3};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct2() {
        //setup
        String signature = "IIIID";
        int[] expected = new int[]{1, 2, 3, 4, 6, 5};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct3() {
        //setup
        String signature = "DIIDID";
        int[] expected = new int[]{2, 1, 3, 5, 4, 7, 6};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct4() {
        //setup
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        int[] expected = new int[]{51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct5() {
        //setup
        String signature = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDIIIIIIIIIIDDDDDDDDDDD";
        int[] expected = new int[]{30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 31, 32, 33, 34, 35, 36, 37, 38, 39, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct6() {
        //setup
        String signature = "DDDDDDDDDDDDDDDDDDDIDDDDIIDIIIDIIDDDIDIIDDIDIIDDDI";
        int[] expected = new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 25, 24, 23, 22, 21, 26, 28, 27, 29, 30, 32, 31, 33, 37, 36, 35, 34, 39, 38, 40, 43, 42, 41, 45, 44, 46, 50, 49, 48, 47, 51};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }

    @Test
    public void testReconstruct7() {
        //setup
        String signature = "DDDDDDDDDIDDDDDDDDIDDDDDDDDDIDDDIIDDIIIDIDIIDI";
        int[] expected = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 19, 18, 17, 16, 15, 14, 13, 12, 11, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 33, 32, 31, 30, 34, 37, 36, 35, 38, 39, 41, 40, 43, 42, 44, 46, 45, 47};

        //test
        int[] permutation = this.permutationSignature.reconstruct(signature);

        //verify
        assertEquals(permutation, expected);
    }
}