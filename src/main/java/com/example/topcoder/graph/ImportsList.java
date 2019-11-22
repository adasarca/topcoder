/*
 * Created by AdelaSarca
 * Date: 11/22/2019
 */
package com.example.topcoder.graph;

/*
* Every big project contains multiple scripts, each of which may require access to other scripts within the project. Each script contains an import list containing zero or more other scripts. A script has access to all the scripts in its import list, and it also has access to all the scripts that the scripts in its import list have access to. More formally, a script A has access to a script B if and only if there exists a sequence of scripts S[0] = A, S[1], ..., S[k] = B, where k >= 1 and for each i, where 0 <= i < k, script S[i] contains script S[i+1] in its import list. There is an important restriction on the usage of import lists: a script must not have access to itself.

You are given the requirements for your project as a String[] requires. It contains exactly N elements, where N is the number of scripts in the project. Character j of element i of requires is 'Y' if script i must have access to script j, and 'N' otherwise. You must generate the import list for each script in such a way that all the requirements are satisfied. This means that each script must have access to all its required scripts, and not have access to unrequired scripts (including itself). The total number of scripts in all the import lists of all the scripts must be as small as possible (if several import lists contain the same script, each occurrence of that script counts toward the total). Return a int[] containing exactly N elements, where element i is the number of scripts in the import list for script i.
* */

public class ImportsList {

    public int[] importsCount(String[] requires) {
        int n = requires.length;
        int[] imports = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (requires[i].charAt(j) == 'Y') {
                    boolean found = false;
                    for (int k = 0; k < n; k++) {
                        if (requires[i].charAt(k) == 'Y' && requires[k].charAt(j) == 'Y') {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        imports[i]++;
                    }
                }
            }
        }
        return imports;
    }
}
