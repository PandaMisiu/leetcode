package org.example;

import java.util.List;

public class ReverseLinkedListII {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeNode = dummy;

        for (int i = 0; i < left - 1; i++) {
            beforeNode = beforeNode.next;
        }

        ListNode start = beforeNode.next;
        ListNode then = start.next;

        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = beforeNode.next;
            beforeNode.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}
