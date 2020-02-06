/*
 * Created by AdelaSarca
 * Date: 2/5/2020
 */
package com.example.topcoder.tree;

import java.util.*;

public class DirectoryTree {

    public String[] display(String[] files) {
        //build tree
        Node root = new Node("ROOT");
        for (String file : files) {
            String[] names = file.split("/");
            Node parent = root;
            for (int i = 1; i < names.length; i++) {
                Node node = parent.children.get(names[i]);
                if (null == node) {
                    node = new Node(names[i]);
                    parent.children.put(names[i], node);
                }
                parent = node;
            }
        }

        //display
        List<String> output = new LinkedList<>();
        output.add(root.name);
        if (!root.children.isEmpty()) {
            String lastChild = root.children.lastKey();
            for (Node node : root.children.values()) {
                this.preOrder(node, "", !node.name.equals(lastChild), output);
            }
        }
        return output.toArray(new String[output.size()]);
    }

    private void preOrder(Node node, String prefix, boolean hasNext, List<String> output) {
        output.add(prefix + "+-" + node.name);
        if (node.children.isEmpty()) {
            return;
        }

        prefix = hasNext ? prefix + "| " : prefix + "  ";
        String lastChild = node.children.lastKey();
        for (Node child : node.children.values()) {
            this.preOrder(child, prefix, !child.name.equals(lastChild), output);
        }
    }

    private static class Node implements Comparable<Node> {
        String name;
        TreeMap<String,Node> children;

        public Node(String name) {
            this.name = name;
            this.children = new TreeMap<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(this.name, node.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name);
        }

        @Override
        public int compareTo(Node o) {
            return this.name.compareTo(o.name);
        }
    }
}
