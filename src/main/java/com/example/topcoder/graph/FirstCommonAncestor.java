/*
 * Created by AdelaSarca
 * Date: 12/5/2019
 */
package com.example.topcoder.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class FirstCommonAncestor {

    public Integer find(int x, int y, Integer[][] family) {
        HashMap<Integer, Node> map = this.buildMap(family);

        LinkedList<Node> queueX = new LinkedList<>();
        LinkedList<Node> queueY = new LinkedList<>();
        queueX.add(map.get(x));
        queueY.add(map.get(y));
        HashSet<Integer> visitedX = new HashSet<>();
        HashSet<Integer> visitedY = new HashSet<>();

        while(!queueX.isEmpty() && !queueY.isEmpty()) {
            Node nodeX = queueX.poll();
            Node nodeY = queueY.poll();
            visitedX.add(nodeX.id);
            visitedY.add(nodeY.id);

            if (visitedX.contains(nodeY.id)) {
                return nodeY.id;
            }
            if (visitedY.contains(nodeX.id)) {
                return nodeX.id;
            }

            if (nodeX.mother != null) {
                queueX.add(nodeX.mother);
            }
            if (nodeX.father != null) {
                queueX.add(nodeX.father);
            }
            if (nodeY.mother != null) {
                queueY.add(nodeY.mother);
            }
            if (nodeY.father != null) {
                queueY.add(nodeY.father);
            }
        }

        return null;
    }

    public Integer find2(int x, int y, Integer[][] family){
        HashMap<Integer, Node> map = this.buildMap(family);

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(map.get(x));
        HashSet<Integer> visited = new HashSet<>();
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            visited.add(node.id);

            if (node.mother != null) {
                queue.add(node.mother);
            }
            if (node.father != null) {
                queue.add(node.father);
            }
        }

        queue = new LinkedList<>();
        queue.add(map.get(y));
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if (visited.contains(node.id)) {
                return node.id;
            }

            if (node.mother != null) {
                queue.add(node.mother);
            }
            if (node.father != null) {
                queue.add(node.father);
            }
        }
        return null;
    }

    private HashMap<Integer, Node> buildMap(Integer[][] family) {
        HashMap<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < family.length; i++) {
            Integer id = family[i][0];
            Integer motherId = family[i][1];
            Integer fatherId = family[i][2];

            map.putIfAbsent(id, new Node(id));
            if (motherId != null) {
                map.putIfAbsent(motherId, new Node(motherId));
                map.get(id).mother = map.get(motherId);
            }
            if (fatherId != null) {
                map.putIfAbsent(fatherId, new Node(fatherId));
                map.get(id).father = map.get(fatherId);
            }
        }
        return map;
    }

    private class Node {
        Integer id;
        Node mother;
        Node father;

        Node(Integer id) {
            this.id = id;
        }
    }
}
