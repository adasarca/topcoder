/*
 * Created by AdelaSarca
 * Date: 1/29/2020
 */
package com.example.topcoder.graph;

import java.util.HashMap;
import java.util.HashSet;

public class AlphabetOrderDiv1 {

    public String isOrdered(String[] words) {
        HashMap<Character, HashSet<Character>> graph = new HashMap<>();
        for (String word : words) {
            int n = word.length();
            for (int i = 0; i < n - 1; i++) {
                char c1 = word.charAt(i);
                char c2 = word.charAt(i + 1);

                graph.putIfAbsent(c1, new HashSet<>());
                if (c1 != c2) {
                    graph.putIfAbsent(c2, new HashSet<>());
                    graph.get(c1).add(c2);
                }
            }
        }

        HashSet<Character> visited = new HashSet<>();
        HashSet<Character> currentRecursion = new HashSet<>();
        for (Character c : graph.keySet()) {
            if (!visited.contains(c) && this.hasCycles(graph, c, visited, currentRecursion)) {
                return "Impossible";
            }
        }
        return "Possible";
    }

    public String isOrdered2(String[] words) {
        boolean[][] graph = new boolean[26][26];
        for (String word : words) {
            for (int i = 0; i < word.length() - 1; i++) {
                int a = word.charAt(i) - 'a';
                int b = word.charAt(i + 1) - 'a';
                if (a != b) {
                    graph[a][b] = true;
                }
            }
        }

        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (!graph[i][j]) {
                        graph[i][j] = graph[i][k] && graph[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (graph[i][i]) {
                return "Impossible";
            }
        }
        return "Possible";
    }

    private boolean hasCycles(HashMap<Character, HashSet<Character>> graph, Character start, HashSet<Character> visited, HashSet<Character> currentRecursion) {
        if (currentRecursion.contains(start)) {
            return true;
        }
        currentRecursion.add(start);
        for (Character c : graph.get(start)) {
            if (!visited.contains(c) && this.hasCycles(graph, c, visited, currentRecursion)) {
                return true;
            }
        }
        currentRecursion.remove(start);
        visited.add(start);
        return false;
    }
}
