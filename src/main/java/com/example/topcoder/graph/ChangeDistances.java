/*
 * Created by AdelaSarca
 * Date: 3/11/2020
 */
package com.example.topcoder.graph;

public class ChangeDistances {

    public String[] findGraph(String[] g) {
        int n = g.length;
        String[] h = new String[n];

        for (int i = 0; i < n; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                if (i == j || g[i].charAt(j) == '1') {
                    row[j] = '0';
                } else {
                    row[j] = '1';
                }
            }

            h[i] = new String(row);
        }
        return h;
    }
}
