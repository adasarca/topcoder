package com.example.topcoder.leetcode.graph;

import java.util.*;

public class CourseSchedule2 {

    private ArrayList<LinkedList<Integer>> graph;
    private int[] visited;
    private int[] output;
    private int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        output = new int[numCourses];
        index = numCourses - 1;
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] != 2 && !dfs(i)) {
                return new int[0];
            }
        }
        return output;
    }

    private boolean dfs(int x) {
        if (visited[x] == 1) return false;

        visited[x] = 1;
        for (int y : graph.get(x)) {
            if (visited[y] != 2 && !dfs(y)) {
                return false;
            }
        }
        visited[x] = 2;
        output[index--] = x;
        return true;
    }
}
