package com.example.topcoder.leetcode;

import java.util.*;

public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2) return head;

        ListNode res = new ListNode(0);
        res.next = head;

        ListNode node = head;
        ListNode prev = res;
        ListNode prevGroup = res;
        int count = 0;
        while(node != null) {
            if (count % k == 0) {
                //check remaining
                ListNode aux = node;
                boolean enough = true;
                for (int i = 0; i < k; i++) {
                    if (aux == null) {
                        enough = false;
                        break;
                    }
                    aux = aux.next;
                }
                if (!enough) break;

                //start new group
                prevGroup = prev;
                prev = node;
                node = node.next;
            } else {
                //move at group start
                prev.next = node.next;
                node.next = prevGroup.next;
                prevGroup.next = node;
                node = prev.next;
            }
            count++;
        }
        return res.next;
    }
}
