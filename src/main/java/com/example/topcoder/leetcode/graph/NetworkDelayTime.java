package com.example.topcoder.leetcode.graph;

import java.util.*;

public class NetworkDelayTime {

    public int networkDelayTime(int[][] times, int N, int K) {
        ArrayList<LinkedList<Node>> graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new LinkedList<>());
        }
        for (int[] time : times) {
            graph.get(time[0]).add(new Node(time[1], time[2]));
        }

        boolean[] visited = new boolean[N + 1];
        int[] d = new int[N + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[K] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparing(n -> n.time));
        queue.add(new Node(K, 0));

        while(!queue.isEmpty()) {
            Node min = queue.poll();
            if (visited[min.id]) continue;

            visited[min.id] = true;

            for (Node node : graph.get(min.id)) {
                if (d[node.id] > d[min.id] + node.time) {
                    d[node.id] = d[min.id] + node.time;
                    queue.add(new Node(node.id, d[node.id]));
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (d[i] == Integer.MAX_VALUE)
                return -1;
            if (d[i] > max) {
                max = d[i];
            }
        }
        return max;
    }

    private static class Node {
        int id;
        int time;

        public Node(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }
}
