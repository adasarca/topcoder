package com.example.topcoder.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/28/2019
 */
public class RoboCourierTest {

    private RoboCourier roboCourier;

    @BeforeMethod
    public void setup() {
        this.roboCourier = new RoboCourier();
    }

    @Test
    public void testTimeToDeliver0() {
        //setup
        String[] path = new String[]{
                "FRRFLLFLLFRRFLF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 15);
    }

    @Test
    public void testTimeToDeliver1() {
        //setup
        String[] path = new String[]{
                "RFLLF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 17);
    }

    @Test
    public void testTimeToDeliver2() {
        //setup
        String[] path = new String[]{
                "FLFRRFRFRRFLLFRRF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 0);
    }

    @Test
    public void testTimeToDeliver3() {
        //setup
        String[] path = new String[]{
                "FFFFFFFFFRRFFFFFFRRFFFFF",
                "FLLFFFFFFLLFFFFFFRRFFFF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 44);
    }

    @Test
    public void testTimeToDeliver4() {
        //setup
        String[] path = new String[]{
                "RFLLFLFLFRFRRFFFRFFRFFRRFLFFRLRRFFLFFLFLLFRFLFLRFF",
                "RFFLFLFFRFFLLFLLFRFRFLRLFLRRFLRFLFFLFFFLFLFFRLFRLF",
                "LLFLFLRLRRFLFLFRLFRF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 24);
    }

    @Test
    public void testTimeToDeliver5() {
        //setup
        String[] path = new String[]{
                "LLFLFRLRRLRFFLRRRRFFFLRFFRRRLLFLFLLRLRFFLFRRFFFLFL",
                "RLFFRRLRLRRFFFLLLRFRLLRFFLFRLFRRFRRRFRLRLRLFFLLFLF",
                "FRFLRFRRLLLRFFRRRLRFLFRRFLFFRLFLFLFRLLLLFRLLRFLLLF",
                "FFLFRFRRFLLFFLLLFFRLLFLRRFRLFFFRRFFFLLRFFLRFRRRLLR",
                "FFFRRLLFLLRLFRRLRLLFFFLFLRFFRLRLLFLRLFFLLFFLLFFFRR",
                "LRFRRFLRRLRRLRFFFLLLLRRLRFFLFRFFRLLRFLFRRFLFLFFLFR",
                "RFRRLRRFLFFFLLRFLFRRFRFLRLRLLLLFLFFFLFRLLRFRLFRLFR",
                "LLFLFRLFFFFFFFRRLRLRLLRFLRLRRRRRRRRLFLFLFLRFLFRLFF",
                "RLFRRLLRRRRFFFRRRLLLLRRLFFLLLLLRFFFFRFRRLRRRFFFLLF",
                "FFFFLRRLRFLLRRLRLRFRRRRLFLLRFLRRFFFRFRLFFRLLFFRRLL"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 169);
    }

    @Test
    public void testTimeToDeliver6() {
        //setup
        String[] path = new String[]{
                "FLFLFFRFFLRLRFLRFLRLLLFLRLFLFRFRRFFFLFLRLFLFLLFLFL", "RFFLFFLRFRLFRFFFRFRFRFRFLFLRFLFRLFLFLLFRFLFLFLFLRL", "FRLFFFFRFFLFFFFRLLRLFFLLFRLFFLRFLRLRFRFRLLFLRLFRFF", "LRLRLRFLRRFLFFLFFLFRFLFLFLRFFFLLFRFRLFFLFFFLFRLLFL", "LRFFLRFRRFRLRFFFLLFRRFFFLFFFLLFLFFFRRFLFRFLFFFLRLF", "FLFRFLFRFFFLLFFLRLFLFLLFLLFFLRRLRLFLFFFLRRFLLFLRFF", "RFLRFLFRLFLLFRFLFFLFLFLRLLFRLFLRLFLFLFLFFRLRLFLFRL", "LRLLRFLFLFLRLLFRFLRLFFFFLFLRLLFFFFLFLRLFRFLFLRFLRF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 54);
    }

    @Test
    public void testTimeToDeliver7() {
        //setup
        String[] path = new String[]{
                "FFLRLFRRFRFFRLFRLRLRLRLRLFFRLRLRLFRLFRFFLLFFFFR", "RLFFLRLFRFFFLLFFFFFRFRLFLRLRFFFLFFFRFFFFFLFFFFF", "FFFRLRFFRFFFRFLRFFFLRFFFLRFFRLFFFFFFFRLFFFLRLRL", "RLFRLFFFRLRLRFLRLFFFFFFFRLFFFFRFFFRRFLFFFFFLLFF", "FFRLFFFFRFFLFFLFRLFFFFFFFFFFRFFFFFLFRLRRFFFLRLF", "LFRLFFFFFFFFFRFFFLRFFFFFFFRLFLFLRRFLFFFRFFFLLFF", "RFFLFFRFFRFFFFFFFRFFFRFLFFLRFFRLFFFFFFFLFFLFFLR", "FFFFRFFFFFRLFFFFLFFLRFFFLFFFFFFFFLFLFFRRLRLRLRF", "FFRFLFFFLRFFLRLLFRLRLRFFFRFFFFRFRRFLLFFFFRLRLRF", "FFFFFRRFFFRLLFFFFFLRFRFFFFR"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 988);
    }

    @Test
    public void testTimeToDeliver8() {
        //setup
        String[] path = new String[]{
                "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 1004);
    }

    @Test
    public void testTimeToDeliver9() {
        //setup
        String[] path = new String[]{
                "FFFFRLLFLFRFFFLRLFFFRFFLRLLFFFFFL", "FFFFFFRLFFRLFFRFRFFFFLFFFFLRFFFLR", "FRLLLFRFRFFFFFFRLFFFFFFLRRFFFRLRL", "F"
        };

        //test
        int time = this.roboCourier.timeToDeliver(path);

        //verify
        assertEquals(time, 218);
    }
}