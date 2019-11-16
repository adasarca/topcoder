package com.example.topcoder.matrix;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FriendlyRooksTest {

    private FriendlyRooks friendlyRooks;

    @BeforeMethod
    public void setup() {
        this.friendlyRooks = new FriendlyRooks();
    }

    @Test
    public void testGetMinFriendlyColoring_Example0() throws Exception {
        //setup
        String[] board = {
                ".R.R",
                "R.R.",
                ".R.R"};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 2);
    }

    @Test
    public void testGetMinFriendlyColoring_Example1() throws Exception {
        //setup
        String[] board = {"RRRRRRRRRRRRRRR"};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 1);
    }

    @Test
    public void testGetMinFriendlyColoring_Example2() throws Exception {
        //setup
        String[] board = {
                "...............",
                "...............",
                "...............",
                "...............",
                "...............",
                "..............."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 0);
    }

    @Test
    public void testGetMinFriendlyColoring_Example3() throws Exception {
        //setup
        String[] board = {
                "....R..........",
                ".R...........R.",
                "....R..........",
                ".R........R....",
                "....R..........",
                "....R.....R...."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 1);
    }

    @Test
    public void testGetMinFriendlyColoring_Example4() throws Exception {
        //setup
        String[] board = {
                "R.........R",
                ".R.......R.",
                "..R.....R..",
                "...R...R...",
                "....R.R....",
                ".....R.....",
                "....R.R....",
                "...R...R...",
                "..R.....R..",
                ".R.......R.",
                "R.........R"};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 6);
    }

    @Test
    public void testGetMinFriendlyColoring_Spiral() throws Exception {
        //setup
        String[] board = {
                "R.R.R.R",
                ".R.R.R.",
                "R.R.R.R",
                ".R.R.R.",
                "R.R.R.R",
                ".R.R.R.",
                "R.R.R.R"};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 2);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest0() throws Exception {
        //setup
        String[] board = 	{"..R.....R...........", ".......R.R..........", "...............RR...", "..R.............R...", "....R.............RR", "....R......R........", "......R..........R..", "...........R.R......", "...............R..R.", "R..R................", "RR........R.RR.R....", ".R........R.........", "R..R.......R......R.", ".......RR...........", ".....RR.............", "........R.R.RR......", "R.............R.....", ".....R...R..........", "..............R....R", "..........R......R.."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 1);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest1() throws Exception {
        //setup
        String[] board = 	{"R.R.................", "....................", ".R..........R.......", "....................", "....R.R.............", "R......R............", ".....R.....R........", "....................", ".R..............R...", "......R...........R.", ".........RR.........", "....................", "........R...R.......", "....................", "..R........R........", "........R.........R.", "..........R.....R...", ".....R...R..........", "....R..R............", "...................."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 1);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest2() throws Exception {
        //setup
        String[] board = 	{"RRR.R.R...RRR.R.", "....R....R......", "R.............R.", "R...............", "....RR...R......", "................", "..R..R.....RR...", "........R.......", ".....R..........", "...R............", "............RRR.", "................", "R.....R...R.....", "R...R...........", "..........R.R...", "......R...R....."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 3);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest3() throws Exception {
        //setup
        String[] board = 	{"RRRRRRR.RRRR...RRR..", "RRRRRRR.RRRR...RRR..", "RRRRRRR.RRRR........", "RRRRRRR.RRRR........", "........RRRRRRRR....", "..........RRRRRR....", "......RR..RRRRRR....", "......RRRRRRRRRR....", "....RR..RR..RR.RRRR.", "....RR......RR.RRRR.", ".RRRRR..RR.....RRRRR", ".RRRRR..RR.....RRRRR", "....RR.........RRRRR", "RRRR.RRRR......RRRRR", "RRRR.RRRR......RRR..", "RRRRRRRRR.RRR.RRR...", "RRRRRRRRR.RRR.RRR...", "RRRRRRR...RRR.......", "RRRRRRRRRR..........", "RR....RRRR.........."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 1);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest4() throws Exception {
        //setup
        String[] board = {"..................RR", "..................RR", "........RR...RR.....", "........RR...RR.....", "....................", "RR..................", "RR..................", "....................", "....................", "....................", "........RRRR........", "........RRRR........", "...RRRR.RRRRRRRR....", "...RRRR.RRRRRRRR....", "...RRRR.....RRRR....", "...RRRR.....RRRR....", "....................", "....................", "....................", "RR.................."};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 3);
    }

    @Test
    public void testGetMinFriendlyColoring_SystemTest5() throws Exception {
        //setup
        String[] board = 	{"R.................R", ".R...............R.", "..R.............R..", "...R...........R...", "....R.........R....", ".....R.......R.....", "......R.....R......", ".......R...R.......", "........R.R........", ".........R.........", "........R.R........", ".......R...R.......", "......R.....R......", ".....R.......R.....", "....R.........R....", "...R...........R...", "..R.............R..", ".R...............R.", "R.................R"};

        //test
        int colors = this.friendlyRooks.getMinFriendlyColoring(board);

        //verify
        assertEquals(colors, 10);
    }

}