package com.example.topcoder.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 3/11/2020
 */
public class ChangeDistancesTest {

    private ChangeDistances changeDistances;

    @BeforeMethod
    public void setup() {
        this.changeDistances = new ChangeDistances();
    }

    @Test
    public void testFindGraph0() {
        //setup
        String[] g = new String[] {
                "011","100","100"
        };

        //test
        String[] h = this.changeDistances.findGraph(g);

        //verify
        this.assertGraph(h, g);
    }

    @Test
    public void testFindGraph1() {
        //setup
        String[] g = new String[] {
                "000","000","000"
        };

        //test
        String[] h = this.changeDistances.findGraph(g);

        //verify
        this.assertGraph(h, g);
    }

    @Test
    public void testFindGraph2() {
        //setup
        String[] g = new String[] {
                "0100","1000","0001","0010"
        };

        //test
        String[] h = this.changeDistances.findGraph(g);

        //verify
        this.assertGraph(h, g);
    }

    private void assertGraph(String[] h, String[] g) {
        assertNotNull(h);

        int n = g.length;
        assertEquals(h.length, n);

        for (int i = 0; i < n; i++) {
            assertEquals(h[i].length(), n);
        }

        int[][] d1 = this.distances(g);
        int[][] d2 = this.distances(h);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    assertNotEquals(d1[i][j], d2[i][j]);
                }
            }
        }
    }

    private int[][] distances(String[] g) {
        int n = g.length;

        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i].charAt(j) == '1') {
                    d[i][j] = 1;
                    d[j][i] = 1;
                } else {
                    d[i][j] = Integer.MAX_VALUE;
                    d[j][i] = Integer.MAX_VALUE;
                }
            }
            d[i][i] = 0;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && j != k && k != i && d[i][k] != Integer.MAX_VALUE && d[k][j] != Integer.MAX_VALUE &&
                            d[i][j] > d[i][k] + d[k][j]) {
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }

        return d;
    }
}