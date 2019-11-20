/*
 * Created by AdelaSarca
 * Date: 11/20/2019
 */
package com.example.topcoder.tree;

import java.util.*;

public class CellRemoval {

    public int cellsLeft(int[] parent, int deletedCell) {
        int n = parent.length;
        Map<Integer, Node> nodeMap = new HashMap<>();

        //build tree
        Node root = null;
        for (int i = 0; i < n; i++) {
            nodeMap.putIfAbsent(i, new Node(i));
            Node node = nodeMap.get(i);

            int p = parent[i];
            if(p == -1) {
                root = nodeMap.get(i);
            } else {
                nodeMap.putIfAbsent(p, new Node(p));
                nodeMap.get(p).getChildren().add(node);
            }
        }

        //post-order
        this.calculateMatureCells(root);

        //calculate result
        return root.getMatureCells() - nodeMap.get(deletedCell).getMatureCells();
    }

    private void calculateMatureCells(Node node) {
        if (node.getChildren().size() == 0) {
            node.setMatureCells(1);
            return;
        }

        int cells = 0;
        for (Node child : node.getChildren()) {
            this.calculateMatureCells(child);
            cells += child.getMatureCells();
        }
        node.setMatureCells(cells);
    }

    private class Node {
        private int value;
        private List<Node> children;
        private int matureCells;

        public Node(int value) {
            this.value = value;
            this.children = new LinkedList<Node>();
        }

        public int getValue() {
            return value;
        }

        public List<Node> getChildren() {
            return children;
        }

        public int getMatureCells() {
            return matureCells;
        }

        public void setMatureCells(int matureCells) {
            this.matureCells = matureCells;
        }
    }
}
