/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
package com.example.topcoder.string;

public class GetAccepted {

    public String answer(String question) {
        String[] words = question.split(" ");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if ("not".equals(words[i])) {
                count++;
            }
        }

        return count % 2 == 0 ? "True." : "False.";
    }

    public String answer2(String question) {
        int n = question.length();
        int i = 0;
        int count = 0;
        while (i < n) {

            if (Character.isLetter(question.charAt(i))) {
                StringBuilder word = new StringBuilder();
                do {
                    word.append(question.charAt(i++));
                } while (i < n && Character.isLetter(question.charAt(i)));

                if ("not".equals(word.toString())) {
                    count++;
                }
            }

            i++;
        }

        return count % 2 == 0 ? "True." : "False.";
    }
}
