package org.example;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;


        ListNode prev = null, current = head, next = null;

        while(current != null){
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }
}
