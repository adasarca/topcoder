/*
 * Created by AdelaSarca
 * Date: 2/18/2020
 */
package com.example.topcoder.combinatorics;

public class PermutationSignature {

    public int[] reconstruct(String signature) {
        signature = "I" + signature;
        int[] p = new int[signature.length()];

        int x = signature.length();
        while(signature.length() > 0) {
            //find last I
            int i = signature.length() - 1;
            while(i >= 0 && signature.charAt(i) != 'I') {
                i--;
            }

            //add greatest numbers at the end
            for (int j = i; j < signature.length(); j++) {
                p[j] = x--;
            }
            signature = signature.substring(0, i);
        }
        return p;
    }
}
