package com.example.topcoder.extra.codility.task2;

import java.util.Iterator;
import java.util.LinkedList;

/*
* Given 2 broken strings, check if they could be equal.
* Strings contain only letters and numbers, where numbers = how many chars could not be read.
* Example: "A2Le" and "2pL1" could both mean "AppLe"
*/
public class Solution {

    public boolean solution(String S, String T) {
        LinkedList<Character> listS = this.convert(S);
        LinkedList<Character> listT = this.convert(T);
        if (listS.size() != listT.size()) return false;

        Iterator<Character> iteratorS = listS.iterator();
        Iterator<Character> iteratorT = listT.iterator();
        while(iteratorS.hasNext()) {
            Character s = iteratorS.next();
            Character t = iteratorT.next();

            if (s == '?' || t == '?') continue;

            if (s != t) return false;
        }
        return true;
    }

    private LinkedList<Character> convert(String s) {
        LinkedList<Character> list = new LinkedList<>();
        int n = s.length();
        int i = 0;
        while(i < n) {
            if (Character.isDigit(s.charAt(i))) {
                long x = 0;
                while(i < n && Character.isDigit(s.charAt(i))) {
                    x = x * 10 + (s.charAt(i) - '0');
                    i++;
                }

                for (long j = 0; j < x; j++) {
                    list.add('?');
                }
            } else {
                list.add(s.charAt(i));
                i++;
            }
        }
        return list;
    }
}
