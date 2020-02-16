package com.example.topcoder.combinatorics;

public class CyclesInPermutations {

    public int maxCycle(int[] board) {
        int n = board.length;
        boolean[] visited = new boolean[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            visited[i] = true;
            int j = board[i] - 1;
            while(!visited[j]) {
                visited[j] = true;
                count++;
                j = board[j] - 1;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
