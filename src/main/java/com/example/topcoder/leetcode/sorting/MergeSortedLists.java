package com.example.topcoder.leetcode.sorting;

import com.example.topcoder.leetcode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparing(node -> node.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        ListNode current = res;
        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            current.next = new ListNode(node.val);
            current = current.next;

            if (node.next != null) {
                queue.add(node.next);
            }
        }
        return res.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        int n = lists.length;
        ListNode res = new ListNode(0);

        ListNode current = res;
        while(true) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    index = i;
                }
            }
            if (index == -1) break;

            current.next = new ListNode(min);
            current = current.next;

            lists[index] = lists[index].next;
        };
        return res.next;
    }
}
