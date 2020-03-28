package com.example.topcoder.leetcode.graph;

import java.util.*;

public class IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] set = new int[n];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                queue.add(i);
                set[i] = 0;
                visited[i] = true;

                while(!queue.isEmpty()) {
                    Integer x = queue.poll();
                    for (int node : graph[x]) {
                        if (visited[node]) {
                            if (set[node] != 1 - set[x]) {
                                return false;
                            }
                        } else {
                            visited[node] = true;
                            set[node] = 1 - set[x];
                            queue.add(node);
                        }
                    }
                }
            }
        }
        return true;
    }
}
