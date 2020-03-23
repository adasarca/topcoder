package com.example.topcoder.leetcode.graph;

import java.util.*;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (null == node) return null;

        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        map.put(node.val, new Node(node.val));

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            Node copy = map.get(current.val);

            copy.neighbors = new ArrayList<>();
            for (Node x : current.neighbors) {
                Node y = map.get(x.val);
                if (null == y) {
                    queue.add(x);

                    y = new Node(x.val);
                    map.put(y.val, y);
                }
                copy.neighbors.add(y);
            }
        }
        return map.get(node.val);
    }
}
