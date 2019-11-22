package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by Adela.Sarca
 * Date: 11/21/2019
 */
public class FoxAndTouristFamiliesTest {

    private FoxAndTouristFamilies foxAndTouristFamilies;

    @BeforeMethod
    public void setup() {
        this.foxAndTouristFamilies = new FoxAndTouristFamilies();
    }

    @Test
    public void testExpectedLength0() {
        //setup
        int[] a = new int[]{0, 1};
        int[] b = new int[]{1, 2};
        int[] f = new int[]{0};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 1.5);
    }

    @Test
    public void testExpectedLength1() {
        //setup
        int[] a = new int[]{0, 1};
        int[] b = new int[]{1, 2};
        int[] f = new int[]{0, 0};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 1.25);
    }

    @Test
    public void testExpectedLength6() {
        //setup
        int[] a = new int[]{0,1,1,3,5,6};
        int[] b = new int[]{1,2,3,4,4,4};
        int[] f = new int[]{5,6,1};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 0.4537037037037037);
    }

    @Test
    public void testExpectedLength7() {
        //setup
        int[] a = new int[]{1, 14, 16, 37, 5, 26, 35, 11, 25, 10, 42, 31, 6, 24, 41, 39, 33, 32, 2, 22, 3, 28, 23, 30, 17, 38, 27, 18, 19, 13, 15, 12, 21, 46, 47, 20, 44, 7, 36, 9, 40, 48, 29, 8, 43, 45, 34, 4};
        int[] b = new int[]{0, 10, 8, 32, 2, 22, 27, 9, 21, 9, 37, 24, 4, 18, 33, 38, 27, 31, 1, 21, 0, 20, 16, 28, 14, 30, 21, 10, 11, 5, 9, 5, 17, 39, 45, 16, 40, 3, 34, 8, 34, 43, 27, 0, 41, 39, 27, 0};
        int[] f = new int[]{20, 13, 35, 10, 45, 0, 36, 11, 23, 26, 29, 16, 20, 25, 22, 22, 27, 1, 33, 9, 31, 9, 30, 33, 48, 13, 36, 6, 8, 9};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 2.28553577709674E-9);
    }

    @Test
    public void testExpectedLength8() {
        //setup
        int[] a = new int[]{4, 38, 24, 11, 21, 23, 18, 12, 8, 41, 40, 39, 47, 35, 36, 30, 31, 45, 26, 5, 48, 19, 28, 27, 49, 17, 14, 10, 2, 16, 25, 34, 20, 42, 50, 15, 37, 22, 6, 44, 1, 43, 7, 3, 46, 29, 32, 33, 13, 9};
        int[] b = new int[]{0, 36, 23, 8, 18, 22, 14, 9, 3, 39, 38, 34, 46, 33, 33, 25, 26, 44, 22, 4, 46, 17, 23, 25, 47, 15, 9, 7, 0, 14, 23, 32, 17, 39, 48, 10, 35, 18, 2, 41, 0, 38, 6, 2, 44, 28, 27, 29, 10, 7};
        int[] f = new int[]{18, 9, 11, 0, 47, 24, 45, 43, 14, 3, 47, 13, 4, 28, 7, 22, 9, 7, 20, 9, 23, 23, 50, 43, 46, 42, 46, 7, 40, 19, 35, 27, 39, 49, 0, 28, 25, 22, 38};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 4.959137653616618E-12);
    }

    @Test
    public void testExpectedLength9() {
        //setup
        int[] a = new int[]{39, 8, 3, 13, 21, 24, 2, 11, 33, 27, 28, 32, 35, 42, 30, 43, 38, 10, 16, 46, 40, 14, 15, 47, 25, 18, 12, 5, 29, 31, 19, 6, 1, 7, 34, 36, 44, 23, 17, 20, 22, 26, 37, 9, 4, 45, 41};
        int[] b = new int[]{38, 7, 2, 11, 20, 22, 0, 9, 31, 25, 27, 31, 34, 40, 28, 42, 36, 9, 15, 45, 38, 12, 13, 46, 23, 17, 10, 4, 28, 30, 18, 4, 0, 6, 32, 34, 43, 21, 15, 19, 20, 24, 36, 7, 2, 44, 40};
        int[] f = new int[]{29, 26, 7, 36, 1, 1, 34, 46, 43, 28, 3, 32, 18};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 0.0011351363544716895);
    }

    @Test
    public void testExpectedLength10() {
        //setup
        int[] a = new int[]{13, 30, 16, 3, 36, 38, 33, 7, 18, 35, 14, 17, 21, 20, 31, 27, 10, 29, 15, 12, 2, 9, 32, 6, 23, 1, 5, 34, 4, 37, 19, 24, 26, 25, 22, 28, 8, 11, 39};
        int[] b = new int[]{10, 27, 12, 0, 33, 36, 30, 4, 14, 34, 12, 15, 17, 19, 30, 26, 9, 25, 13, 8, 0, 7, 31, 5, 22, 0, 2, 31, 2, 34, 16, 22, 24, 21, 18, 24, 6, 10, 37};
        int[] f = new int[]{13, 33};

        //test
        double l = this.foxAndTouristFamilies.expectedLength(a, b, f);

        //verify
        assertEquals(l, 3.715976331360947);
    }
}