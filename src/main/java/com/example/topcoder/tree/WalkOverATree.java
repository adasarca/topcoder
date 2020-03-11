/*
 * Created by AdelaSarca
 * Date: 3/11/2020
 */
package com.example.topcoder.tree;

public class WalkOverATree {

    public int maxNodesVisited(int[] parent, int L) {
        int n = parent.length + 1;

        int depth = 0;
        int[] d = new int[n];
        for (int i = 1; i < n; i++) {
            d[i] = 1 + d[parent[i - 1]];
            if (d[i] > depth) {
                depth = d[i];
            }
        }

        if (L <= depth) return L + 1;

        return Integer.min(n, 1 + depth + (L - depth) / 2);
    }
}
