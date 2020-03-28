package com.example.topcoder.leetcode.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ReconstructItineraryTest {

    private ReconstructItinerary reconstructItinerary;

    @BeforeMethod
    public void setup() {
        this.reconstructItinerary = new ReconstructItinerary();
    }

    @Test
    public void testFindItinerary0() throws Exception {
        //setup
        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("MUC","LHR"),
                Arrays.asList("JFK", "MUC"),
                Arrays.asList("SFO", "SJC"),
                Arrays.asList("LHR", "SFO")
        );
        List<String> expected = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");

        //test
        List<String> itinerary = this.reconstructItinerary.findItinerary(tickets);

        //verify
        assertEquals(itinerary, expected);
    }

    @Test
    public void testFindItinerary1() throws Exception {
        //setup
        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("JFK", "ATL"),
                Arrays.asList("ATL","ROM"),
                Arrays.asList("JFK","TSR"),
                Arrays.asList("TSR","JFK"),
                Arrays.asList("JFK","CAG"),
                Arrays.asList("CAG","LHR"),
                Arrays.asList("LHR","CAG"),
                Arrays.asList("CAG","MUC"),
                Arrays.asList("MUC","JFK")
        );
        List<String> expected = Arrays.asList("JFK","CAG","LHR","CAG","MUC","JFK","TSR","JFK","ATL","ROM");

        //test
        List<String> itinerary = this.reconstructItinerary.findItinerary(tickets);

        //verify
        assertEquals(itinerary, expected);
    }

}