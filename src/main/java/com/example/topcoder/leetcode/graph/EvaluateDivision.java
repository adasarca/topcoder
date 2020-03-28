package com.example.topcoder.leetcode.graph;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (List<String> eq : equations) {
            String x = eq.get(0);
            String y = eq.get(1);

            if (!map.containsKey(x)) {
                map.put(x, n++);
            }
            if (!map.containsKey(y)) {
                map.put(y, n++);
            }
        }

        //init query matrix
        Double[][] q = new Double[n][n];
        for (int i = 0; i < n; i++) {
            q[i][i] = 1.0;
        }
        int k = 0;
        for (List<String> eq : equations) {
            Integer x = map.get(eq.get(0));
            Integer y = map.get(eq.get(1));
            q[x][y] = values[k++];
            if (q[x][y] != 0) {
                q[y][x] = 1.0 / q[x][y];
            }
        }

        //compute possible queries
        for (k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (q[i][j] == null && q[i][k] != null && q[k][j] != null) {
                        q[i][j] = q[i][k] * q[k][j];

                        if (q[i][j] != 0) {
                            q[j][i] = 1.0 / q[i][j];
                        }
                    }
                }
            }
        }

        //build results
        int m = queries.size();
        double[] results = new double[m];
        k = 0;
        for (List<String> query : queries) {
            Integer i = map.get(query.get(0));
            Integer j = map.get(query.get(1));

            results[k++] = (i != null && j != null && q[i][j] != null) ? q[i][j] : -1;
        }
        return results;
    }
}
