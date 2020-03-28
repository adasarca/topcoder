package com.example.topcoder.leetcode.graph;

import java.util.*;

public class MinimumHeightTrees {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n < 1) return Collections.emptyList();

        ArrayList<HashSet<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for(int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() < 2) {
                set.add(i);
            }
        }

        while(n > 2) {
            HashSet<Integer> next = new HashSet<>();
            for (Integer leaf : set) {
                for (Integer node : graph.get(leaf)) {
                    graph.get(node).remove(leaf);
                    if (graph.get(node).size() < 2) {
                        next.add(node);
                    }
                }
                graph.get(leaf).clear();
                n--;
            }
            set = next;
        }
        return new ArrayList<>(set);
    }

    public List<Integer> findMinHeightTrees2(int n, int[][] edges) {
        int m = edges.length;
        if (m != n - 1) return Collections.emptyList();

        //dist between all nodes
        //for each node: height = longest distance
        //find min height
        //keep map with <height, List<root>>

        int[][] d = new int[n][n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = Integer.MAX_VALUE;
            }
            d[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            d[x][y] = 1;
            d[y][x] = 1;

            h[x] = 1;
            h[y] = 1;
        }

        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (k != i && k != j && i != j && d[i][k] != Integer.MAX_VALUE &&
                            d[k][j] != Integer.MAX_VALUE && d[i][k] + d[k][j] < d[i][j]) {

                        d[i][j] = d[i][k] + d[k][j];

                        if (d[i][j] > h[i])
                            h[i] = d[i][j];
                        if (d[i][j] > h[j])
                            h[j] = d[i][j];
                    }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(h[i], new LinkedList<>());
            map.get(h[i]).add(i);
            if (h[i] < min) {
                min = h[i];
            }
        }
        return map.get(min);
    }
}
