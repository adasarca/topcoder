package com.example.topcoder.leetcode.graph;

import java.util.*;

public class RedundantConnection {

    private HashMap<Integer, Integer> parent;
    private HashMap<Integer, Integer> rank;

    public int[] findRedundantConnection(int[][] edges) {
        parent = new HashMap<>();
        rank = new HashMap<>();

        for (int[] edge : edges) {
            Integer x = edge[0];
            Integer y = edge[1];

            Integer setX = this.find(x);
            Integer setY = this.find(y);
            if (setX == setY) {
                return new int[]{x, y};
            }

            if (rank.get(setX) > rank.get(setY)) {
                parent.put(setY, setX);
            } else {
                parent.put(setX, setY);
                if (rank.get(setX) == rank.get(setY)) {
                    rank.compute(setY, (k,v) -> v++);
                }
            }
        }
        return new int[0];
    }

    private Integer find(Integer node) {
        if (!parent.containsKey(node)) {
            parent.put(node, node);
            rank.put(node, 0);
        } else if (parent.get(node) != node) {
            Integer p = this.find(parent.get(node));
            parent.put(node, p);
        }
        return parent.get(node);
    }
}
