/*
 * Created by AdelaSarca
 * Date: 12/3/2019
 */
package com.example.topcoder.tree;

import java.util.HashMap;

public class BuildingSpanningTreesDiv1 {

    public int getNumberOfSpanningTrees(int n, int[] x, int[] y) {
        int m = x.length;
        int prime = 987654323;

        HashMap<Integer, Integer> setParent = new HashMap<>();
        HashMap<Integer, Integer> setComponents = new HashMap<>();
        int[] setRank = new int[n + 1];
        for (int j = 0; j < m; j++) {
            int a = x[j];
            int b = y [j];

            //find
            setParent.putIfAbsent(a, a);
            setParent.putIfAbsent(b, b);
            setComponents.putIfAbsent(a, 1);
            setComponents.putIfAbsent(b, 1);
            Integer setA = this.find(setParent, a);
            Integer setB = this.find(setParent, b);

            //identify cycles
            if (setA.equals(setB)) return 0;

            //merge
            int c = setComponents.get(setB) + setComponents.get(setA);
            if (setRank[setA] > setRank[setB]) {
                setParent.put(setB, setA);
                setComponents.put(setA, c);
            } else {
                setParent.put(setA, setB);
                setComponents.put(setB, c);
                if (setRank[setA] == setRank[setB]) {
                    setRank[setB]++;
                }
            }
        }

        int components = 0;
        long result = 1;
        for (Integer i : setParent.keySet()) {
            if (setParent.get(i).equals(i)) {
                components++;
                result = (result * setComponents.get(i)) % prime;
            }
        }
        int remaining = n - setParent.keySet().size();
        if (remaining == 0 && components == 1) {
            //edges already form a spanning tree
            return 1;
        }

        int k = remaining + components;
        for (int i = 0; i < k - 2; i++) {
            result = (result * n) % prime;
        }
        return (int)result;
    }

    private Integer find(HashMap<Integer, Integer> setParent, int node) {
        if (setParent.get(node) != node) {
            Integer parent = this.find(setParent, setParent.get(node));
            setParent.put(node, parent);
        }
        return setParent.get(node);
    }

    public int getNumberOfSpanningTrees2(int n, int[] x, int[] y) {
        int m = x.length;
        int prime = 987654323;

        int[] set = new int[n + 1];
        int[] rank = new int[n + 1];
        int[] count = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            set[i] = i;
            count[i] = 1;
        }

        for (int j = 0; j < m; j++) {
            int a = x[j];
            int b = y[j];

            //identify components
            int setA = this.find(set, a);
            int setB = this.find(set, b);

            //identify cycles
            if (setA == setB) {
                return 0;
            }

            //merge
            if (rank[setA] > rank[setB]) {
                set[setB] = setA;
                count[setA] += count[setB];
            } else {
                set[setA] = setB;
                count[setB] += count[setA];
                if (rank[setA] == rank[setB]) {
                    rank[setB]++;
                }
            }
        }

        int components = 0;
        long compRes = 1;
        for (int i = 1; i <= n; i++) {
            if (set[i] == i) {
                components++;
                compRes = (compRes * count[i]) % prime;
            }
        }
        if (components == 1) {
            return 1;
        }

        long res = 1;
        for (int i = 0; i < components - 2; i++) {
            res = (res * n) % prime;
        }
        res = (res * compRes) % prime;
        return (int)res;
    }

    private int find(int[] set, int node) {
        if (set[node] != node) {
            set[node] = find(set, set[node]);
        }
        return set[node];
    }
}
