/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.sorting;

public class CostOfDancing {

    public int minimum(int k, int[] danceCost) {
        this.sort(danceCost, 0, danceCost.length - 1);

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += danceCost[i];
        }

        return sum;
    }

    private void sort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }

        int m = (l + r) / 2;

        this.sort(a, l, m);
        this.sort(a, m + 1, r);
        this.merge(a, l, m, r);
    }

    private void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int a1[] = new int[n1];
        int a2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            a1[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = a[m + i + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            a[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }
        while (i < n1) {
            a[k++] = a1[i++];
        }
        while (j < n2) {
            a[k++] = a2[j++];
        }
    }
}
