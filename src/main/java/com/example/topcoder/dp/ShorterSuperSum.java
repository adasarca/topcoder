/*
 * Created by Adela.Sarca
 * Date: 11/14/2019
 */
package com.example.topcoder.dp;

/*
* SuperSum is a function defined as:
*     - SuperSum(0 , n) = n, for all positive n.
*     - SuperSum(k , n) = SuperSum(k-1 , 1) + SuperSum(k-1 , 2) + ... + SuperSum(k-1 , n), for all positive k, n.
* Given k and n, return the value for SuperSum(k , n).
*/

public class ShorterSuperSum {

    public int calculate(int k, int n) {

        int dp[][] = new int[k + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        return dp[k][n];
    }

}
