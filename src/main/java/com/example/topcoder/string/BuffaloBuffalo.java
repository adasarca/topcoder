/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
package com.example.topcoder.string;

public class BuffaloBuffalo {

    public String check(String s) {

        if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
            return "Not good";
        }

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!"buffalo".equals(words[i])) {
                return "Not good";
            }
        }
        return "Good";
    }

    public String check2(String s) {

        int n = s.length();
        String notGood = "Not good";
        if (s.charAt(n - 1) == ' ') {
            return notGood;
        }

        int words = 0;
        int i = 0;
        boolean spaceAllowed = false;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                if (!spaceAllowed) {
                    return notGood;
                }
                i++;
                spaceAllowed = false;
            } else if (Character.isLetter(s.charAt(i))) {
                StringBuilder word = new StringBuilder();
                do {
                    word.append(s.charAt(i++));
                } while (i < n && Character.isLetter(s.charAt(i)));

                if (!"buffalo".equals(word.toString())) {
                    return notGood;
                }
                words++;
                spaceAllowed = true;
            } else {
                return notGood;
            }
        }

        return (words > 0) ? "Good" : notGood;
    }
}
