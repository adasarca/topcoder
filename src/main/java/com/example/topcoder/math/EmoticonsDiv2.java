/*
 * Created by AdelaSarca
 * Date: 11/20/2019
 */
package com.example.topcoder.math;

/*
* You are very happy because you advanced to the next round of a very important programming contest. You want your best friend to know how happy you are. Therefore, you are going to send him a lot of smile emoticons. You are given an int smiles: the exact number of emoticons you want to send.

You have already typed one emoticon into the chat. Then, you realized that typing is slow. Instead, you will produce the remaining emoticons using copy and paste.

You can only do two different operations:
Copy all the emoticons you currently have into the clipboard.
Paste all emoticons from the clipboard.
Each operation takes precisely one second. Copying replaces the old content of the clipboard. Pasting does not empty the clipboard. Note that you are not allowed to copy just a part of the emoticons you already have.
*/

public class EmoticonsDiv2 {

    public int printSmiles(int smiles) {
        int current = 2;
        int clipboard = 1;
        int time = 2;
        while (current < smiles) {
            if ((smiles - current) % current == 0) {
                clipboard = current;
                time++;
            }

            current += clipboard;
            time++;
        }
        return time;
    }
}
