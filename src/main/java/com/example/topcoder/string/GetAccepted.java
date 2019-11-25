/*
 * Created by AdelaSarca
 * Date: 11/25/2019
 */
package com.example.topcoder.string;

public class GetAccepted {

    public String answer(String question) {

        int i = 0;
        int count = 0;
        while (i < question.length()) {

            if (Character.isLetter(question.charAt(i))) {
                StringBuilder word = new StringBuilder();
                do {
                    word.append(question.charAt(i++));
                } while (Character.isLetter(question.charAt(i)));

                if ("not".equals(word.toString())) {
                    count++;
                }
            }

            i++;
        }

        return count % 2 == 0 ? "True." : "False.";
    }
}
