/*
 * Created by Adela.Sarca
 * Date: 11/15/2019
 */
package com.example.topcoder.tree;

/*
* Given a tree array where tree[i] = parent(i + 1), calculate the largest number of connected components you can get by removing a single vertex.
* Tree will contain between 1 and 99 elements, inclusive.
* For each valid i tree[i] will be between 0 and i, inclusive.
*/

public class TreeAndVertex {

    public int get(int[] tree) {
        int n = tree.length;
        int[] out = new int[n + 1];

        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int y = tree[i];

            out[x]++;
            out[y]++;
            if (out[y] > max) {
                max = out[y];
            }
        }

        return max;
    }
}
