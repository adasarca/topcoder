package com.example.topcoder.matrix;

/*
* You have a rectangular chessboard divided into unit squares. Each square is either empty or contains a rook. You are given the String[] board describing which squares of the board contain rooks. If board[i][j] equals 'R', there is a rook on the square in row i, column j. If board[i][j] equals '.', the corresponding square is empty.

We say that two rooks attack each other if and only if all the following conditions are satisfied:

The rooks are of different colors.
They are in the same row or in the same column.
There are no other rooks between them.
You are going to color all the rooks. We say that a coloring of rooks is friendly if no two rooks attack each other. You want to produce a friendly coloring. What is the maximum number of distinct colors you may use?
*/

public class FriendlyRooks {

    private int[][] matrix;
    private int n, m;

    public int getMinFriendlyColoring(String[] board) {
        this.n = board.length;
        this.m = board[0].length();

        this.matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == '.') {
                    matrix[i][j] = -1;
                }
            }
        }

        int color = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    this.color(i, j, ++color);
                }
            }
        }
        return color;
    }

    private void color(int i, int j, int color) {
        matrix[i][j] = color;

        for (int x = i + 1; x < n && matrix[x][j] < 1; x++) {
            if (matrix[x][j] == 0) {
                this.color(x, j, color);
            }
        }
        for (int x = i - 1; x >= 0 && matrix[x][j] < 1; x--) {
            if (matrix[x][j] == 0) {
                this.color(x, j, color);
            }
        }
        for (int y = j + 1; y < m && matrix[i][y] < 1; y++) {
            if (matrix[i][y] == 0) {
                this.color(i, y, color);
            }
        }
        for (int y = j - 1; y >= 0 && matrix[i][y] < 1; y--) {
            if (matrix[i][y] == 0) {
                this.color(i, y, color);
            }
        }
    }
}
