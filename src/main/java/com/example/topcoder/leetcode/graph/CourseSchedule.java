package com.example.topcoder.leetcode.graph;

import java.util.*;

public class CourseSchedule {

    private ArrayList<LinkedList<Integer>> graph;
    private int[] visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new LinkedList<>());
        }

        int m = prerequisites.length;
        for (int i = 0; i < m; i++) {
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];
            graph.get(y).add(x);
        }

        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] != 2 && !this.dfs(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int x) {
        if (visited[x] == 1) return false;

        visited[x] = 1;
        for (Integer y : graph.get(x)) {
            if (visited[y] != 2 && !this.dfs(y)) {
                return false;
            }
        }
        visited[x] = 2;
        return true;
    }
}
