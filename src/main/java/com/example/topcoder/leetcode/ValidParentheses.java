package com.example.topcoder.leetcode;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            Character o = map.get(c);

            if (null == o) {
                //open bracket
                stack.push(c);
            } else {
                //close bracket
                if (stack.isEmpty() || o != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
