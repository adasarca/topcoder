package com.example.topcoder.graph;

/*
 * You are given an undirected graph with n vertices numbered 0 through n-1. For each valid i, there is an undirected edge connecting two different vertices x[i] and y[i]. No two edges connect the same pair of vertices.

 * A triangle is a set of three distinct vertices such that each pair of those vertices is connected by an edge. Formally, three distinct vertices u,v,w are a triangle if the graph contains the edges (u,v), (v,w), and (w,u).

 * You are given the description of the graph: the int n and the int[]s x and y. You are allowed to add edges to this graph. You may add as many edges as you want, and each of them may connect any two vertices. Your goal is to produce a graph that contains at least one triangle. Compute and return the smallest number of edges you need to add.
 */

public class TriangleEasy {

    public int find(int n, int[] x, int[] y) {
        boolean[][] graph = new boolean[n][n];
        for (int k = 0; k < x.length; k++) {
            graph[x[k]][y[k]] = true;
            graph[y[k]][x[k]] = true;
        }

        int min = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || k == i)
                        continue;

                    int edges = 3;
                    if (graph[i][j]) edges--;
                    if (graph[j][k]) edges--;
                    if (graph[k][i]) edges--;

                    if (edges < min) min = edges;
                }
            }
        }
        return min;
    }
}
