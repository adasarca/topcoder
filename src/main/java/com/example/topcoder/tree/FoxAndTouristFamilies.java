/*
 * Created by AdelaSarca
 * Date: 11/21/2019
 */
package com.example.topcoder.tree;

/*
* Fox Ciel has recently visited the Tourist Kingdom. The people of this kingdom love to travel.

The kingdom contains n cities, conveniently numbered 0 through n-1. There are exactly n-1 roads in the kingdom. Each road is bidirectional and connects exactly two cities.

Let a simple path be a sequence of two or more cities such that no city is repeated in the sequence and each pair of consecutive cities is connected by a road. In our kingdom, for each pair of cities there is a simple path that starts with one of them and ends with the other. It follows that the road network always has to be a tree.

You are given the roads as two int[]s A and B, each with n-1 elements. For each valid i, there is a road connecting the cities A[i] and B[i].

There are m families in the kingdom. The families are numbered 0 through m-1. Each family lives in a single city. Multiple families may live in the same city. You are given a int[] f with m elements. For each i, family i lives in the city f[i].

Before the next holidays, each family i will randomly choose a destination city x[i]. The choice will be made uniformly at random from the set of all cities other than their home city f[i]. The choices made by different families are mutually independent. During the holidays, each family will travel from their home city f[i] to the chosen destination city x[i] using the simple path that connects them. (Note that there is always exactly one such simple path.)

Depending on all the random choices, it may happen that some roads will be used by all the traveling families. If a road is used by all families, we will call it full. The king of Tourist Kingdom will have all the full roads decorated for the families to enjoy. Given a particular set of choices made by the families, let L be the number of full roads (possibly zero).

You are given the int[]s A, B, and f. Compute and return the expected value of L.
*/

public class FoxAndTouristFamilies {

    public double expectedLength(int[] a, int[] b, int[] f) {
        int n = a.length + 1;
        int m = f.length;

        //calculate distances between all nodes
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
            dist[i][i] = 0;
        }
        for (int k = 0; k < n-1; k++) {
            dist[a[k]][b[k]] = 1;
            dist[b[k]][a[k]] = 1;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        //calculate result
        double p = 0.0;
        for (int k = 0; k < n-1; k++) {
            int x = a[k], y = b[k];

            //calculate how many nodes are in the x tree and how many in the y tree
            int xNodes = 0, yNodes = 0;
            for (int i = 0; i < n; i++) {
                if (dist[i][x] < dist[i][y]) {
                    xNodes++;
                } else {
                    yNodes++;
                }
            }

            double pRoad = 1.0;
            for (int j = 0; j < m; j++) {
                int city = f[j];
                if (dist[city][x] < dist[city][y]) {
                    pRoad *= yNodes * 1.0 / (n-1);
                } else {
                    pRoad *= xNodes * 1.0 / (n-1);
                }
            }
            p += pRoad;
        }
        return p;
    }
}
