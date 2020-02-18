/*
 * Created by AdelaSarca
 * Date: 2/17/2020
 */
package com.example.topcoder.combinatorics;

public class LittleElephantAndPermutationDiv2 {

    public long getNumber(int n, int k) {
        int[] a = new int[n];
        int[] b = new int[n];

        long factN = 1;
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
            b[i - 1] = i;
            factN *= i;
        }

        long count = 0;
        do {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i] > b[i] ? a[i] : b[i];
            }
            if (sum >= k) {
                count++;
            }
        } while (nextPermutation(a));

        return count * factN;
    }

    private boolean nextPermutation(int[] p) {
        int n = p.length;
        for (int pos = n - 2; pos >= 0; pos--) {
            if (p[pos] < p[pos + 1]) {
                int next = n - 1;
                while(p[next] < p[pos]) {
                    next--;
                }

                //swap pos with next
                this.swap(p, pos, next);

                //reverse right sub-array
                int i = pos + 1;
                int j = n - 1;
                while(i < j) {
                    this.swap(p, i++, j--);
                }
                return true;
            }
        }
        return false;
    }

    private void swap(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
