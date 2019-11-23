package com.example.topcoder.matrix;

/*
* The elements of a two-dimensional matrix with M rows and N columns are usually stored as a linear array of length M*N. Assuming "row-major" order, elements are stored left-to-right, then top-to-bottom (the same order that we read English text on a written page). For example, the following matrix A, with M=3 and N=3:

    0 1 2
    3 4 5
    6 7 8
is stored as: { 0, 1, 2, 3, 4, 5, 6, 7, 8 }.

The transpose of a matrix A (denoted AT) is obtained by exchanging its rows and columns. Element ATij equals Aji , and if A has M rows and N columns, AT will have N rows and M columns. For example, the transpose of the above matrix is:

    0 3 6
    1 4 7
    2 5 8
and is stored as: { 0, 3, 6, 1, 4, 7, 2, 5, 8 }.

Computing the transpose of the square matrix "in place" (overwriting the original matrix) in this example is easy: it involves swapping 3 pairs of elements: 1 and 3, 2 and 6, and 5 and 7. Elements 0, 4, and 8 do not need to be moved.

It is a bit more tricky when the matrix is not square. For example, the matrix:

    12 58 23
    81 74 96
is stored as { 12, 58, 23, 81, 74, 96 }. Its transpose is:

    12 81
    58 74
    23 96
and is stored as: { 12, 81, 58, 74, 23, 96 }. This also requires 3 swaps. (See example 1 below.)

Given M and N, return the minimum number of swaps necessary to take the transpose of a matrix of that size in place.

*
* */

public class Transpose {

    public int numSwaps(int n, int m) {
        int[] a = new int[n * m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = i * m + j;
                int k = j * n + i;
                a[k] = x;
            }
        }

        int swaps = 0;
        for (int i = 0; i < n * m; i++) {
            while (a[i] != i) {
                int aux = a[i];
                a[i] = a[aux];
                a[aux] = aux;
                swaps++;
            }
        }
        return swaps;
    }
}
