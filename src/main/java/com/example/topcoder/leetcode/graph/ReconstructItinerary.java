package com.example.topcoder.leetcode.graph;

import java.util.*;

public class ReconstructItinerary {

    private HashMap<String, PriorityQueue<String>> graph;
    private LinkedList<String> output;

    public List<String> findItinerary(List<List<String>> tickets) {
        graph = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);

            graph.putIfAbsent(from, new PriorityQueue<>());
            graph.putIfAbsent(to, new PriorityQueue<>());

            graph.get(from).add(to);
        }

        output = new LinkedList<>();
        this.dfs("JFK");
        return output;
    }

    private void dfs(String start) {
        if (graph.containsKey(start)) {
            while (!graph.get(start).isEmpty()) {
                String next = graph.get(start).poll();
                this.dfs(next);
            }
        }
        output.addFirst(start);
    }
}
