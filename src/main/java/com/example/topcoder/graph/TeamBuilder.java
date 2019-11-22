/*
 * Created by AdelaSarca
 * Date: 11/22/2019
 */
package com.example.topcoder.graph;

/*
* 	You are arranging a weird game for a team building exercise. In this game there are certain locations that people can stand at, and from each location there are paths that lead to other locations, but there are not necessarily paths that lead directly back. You have everything set up, but you need to know two important numbers. There might be some locations from which every other location can be reached. There might also be locations that can be reached from every other location. You need to know how many of each of these there are.

Create a class TeamBuilder with a method specialLocations that takes a String[] paths that describes the way the locations have been connected, and returns a int[] with exactly two elements, the first one is the number of locations that can reach all other locations, and the second one is the number of locations that are reachable by all other locations. Each element of paths will be a String containing as many characters as there are elements in paths. The i-th element of paths (beginning with the 0-th element) will contain a '1' (all quotes are for clarity only) in position j if there is a path that leads directly from i to j, and a '0' if there is not a path that leads directly from i to j.
* */

public class TeamBuilder {

    public int[] specialLocations(String[] paths) {
        int n = paths.length;
        int[][] dist = new int[n+1][n+1];
        int[] in = new int[n];
        int[] out = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (paths[i].charAt(j) == '1') {
                    dist[i][j] = 1;
                    out[i]++;
                    in[j]++;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
            if (dist[i][i] == Integer.MAX_VALUE) {
                dist[i][i] = 0;
                out[i]++;
                in[i]++;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && dist[i][j] > dist[i][k] + dist[k][j]) {
                        if (dist[i][j] == Integer.MAX_VALUE) {
                            out[i]++;
                            in[j]++;
                        }
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int[] locations = new int[2];
        for (int i = 0; i < n; i++) {
            if (out[i] == n) {
                locations[0]++;
            }
            if (in[i] == n) {
                locations[1]++;
            }
        }
        return locations;
    }
}
