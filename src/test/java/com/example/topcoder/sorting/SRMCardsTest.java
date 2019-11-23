package com.example.topcoder.sorting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SRMCardsTest {

    private SRMCards srmCards;

    @BeforeMethod
    public void setup() {
        this.srmCards = new SRMCards();
    }

    @Test
    public void testMaxTurns_Example0() throws Exception {
        //setup
        int[] cards = new int[]{498, 499};

        //test
        int turns = this.srmCards.maxTurns(cards);

        //verify
        assertEquals(turns, 1);
    }

    @Test
    public void testMaxTurns_Example1() throws Exception {
        //setup
        int[] cards = new int[]{};

        //test
        int turns = this.srmCards.maxTurns(cards);

        //verify
        assertEquals(turns, 0);
    }

    @Test
    public void testMaxTurns_Example2() throws Exception {
        //setup
        int[] cards = new int[]{};

        //test
        int turns = this.srmCards.maxTurns(cards);

        //verify
        assertEquals(turns, 0);
    }

    @Test
    public void testMaxTurns_Example3() throws Exception {
        //setup
        int[] cards = new int[]{};

        //test
        int turns = this.srmCards.maxTurns(cards);

        //verify
        assertEquals(turns, 0);
    }

    @Test
    public void testMaxTurns_Example4() throws Exception {
        //setup
        int[] cards = new int[]{};

        //test
        int turns = this.srmCards.maxTurns(cards);

        //verify
        assertEquals(turns, 0);
    }

}