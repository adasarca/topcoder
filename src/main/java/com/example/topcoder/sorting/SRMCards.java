package com.example.topcoder.sorting;

public class SRMCards {

    public int maxTurns(int[] cards) {
        int n = cards.length;
        this.sort(cards, 0, n - 1);

        int count = 0;
        int i;
        for (i = 0; i < n - 1; i++) {
            count++;
            if (cards[i] + 1 == cards[i + 1]) {
                i++;
            }
        }
        if (i == n - 1) {
            count++;
        }
        return count;
    }

    private void sort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }

        int m = (r + l) / 2;

        this.sort(a, l, m);
        this.sort(a, m + 1, r);
        this.merge(a, l, m, r);
    }

    private void merge (int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = a[i + l];
        }
        for (int j = 0; j < n2; j++) {
            a2[j] = a[j + m + 1];
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
