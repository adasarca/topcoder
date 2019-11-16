package com.example.topcoder.sorting;

import java.util.Arrays;

/*
* You are given a int[] a. The elements of a are not necessarily distinct.
* You want to rearrange the elements of a into a non-decreasing order. What is the smallest possible number of elements you have to move?
*/

public class SortingSubsets { //faster sort

    public int getMinimalSize(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        Arrays.sort(a);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count;
    }

    public int getMinimalSize2(int[] a) { //selection sort
        int n = a.length;

        boolean[] moved = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                moved[i] = true;
                moved[min] = true;
                int aux = a[i];
                a[i] = a[min];
                a[min] = aux;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (moved[i]) {
                count++;
            }
        }
        return count;
    }
}
