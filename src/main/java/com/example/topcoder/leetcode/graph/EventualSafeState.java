package com.example.topcoder.leetcode.graph;

import java.util.*;

public class EventualSafeState {

    private int[][] graph;
    private int[] visited;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.graph = graph;
        int n = graph.length;
        this.visited = new int[n];

        List<Integer> output = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i] == 2 || dfs(i)) {
                output.add(i);
            }
        }
        return output;
    }

    private boolean dfs(int start) {
        if (visited[start] == 1) return false;

        visited[start] = 1;
        for (int node : graph[start]) {
            if (visited[node] != 2 && !this.dfs(node)) {
                return false;
            }
        }
        visited[start] = 2;
        return true;
    }
}
