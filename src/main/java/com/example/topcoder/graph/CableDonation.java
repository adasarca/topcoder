/*
 * Created by AdelaSarca
 * Date: 12/2/2019
 */
package com.example.topcoder.graph;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CableDonation {

    public int cable(String[] lengths) {
        int n = lengths.length;
        int[] setParent = new int[n];
        int[] setRank = new int[n];

        //build list of edges
        int total = 0;
        List<Edge> graph = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = lengths[i].charAt(j);

                if (c == '0') continue;

                int length = (c >= 'a') ? c - 'a' + 1 : c - 'A' + 27;
                total += length;

                if (i != j) {
                    graph.add(new Edge(i, j, length));
                }
            }
            setParent[i] = i;
        }

        //sort edges
        Collections.sort(graph);

        Iterator<Edge> iterator = graph.iterator();
        int count = 0;
        int length = 0;
        while (count < n - 1 && iterator.hasNext()) {
            Edge edge = iterator.next();
            int setX = this.findParent(setParent, edge.x);
            int setY = this.findParent(setParent, edge.y);

            //detect cycles
            if (setX == setY) continue;

            //add to mst
            count++;
            length += edge.length;

            //union
            if (setRank[setX] > setRank[setY]) {
                setParent[setY] = setX;
            } else {
                setParent[setX] = setY;
                if (setRank[setX] == setRank[setY]) {
                    setRank[setY]++;
                }
            }
        }

        if (count < n - 1) {
            return -1;
        }
        return total - length;
    }

    private int findParent(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = this.findParent(parent, parent[node]);
        }
        return parent[node];
    }

    private class Edge implements Comparable<Edge> {
        int x;
        int y;
        int length;

        Edge(int x, int y, int length) {
            this.x = x;
            this.y = y;
            this.length = length;
        }

        public int compareTo(Edge edge) {
            return this.length - edge.length;
        }
    }
}
