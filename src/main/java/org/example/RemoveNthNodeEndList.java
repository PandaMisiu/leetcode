package org.example;


public class RemoveNthNodeEndList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 0ms, 100% beat, 99% memory
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;

        while(current!=null) {
            length++;
            current = current.next;
        }
        if(length == 1) return null;
        if(length-n == 0) {
            head = head.next;
            return head;
        }

        current = head;

        for(int i = 0; i<length-n-1;i++){
            current= current.next;
        }

        ListNode next = current.next;
        if(next == null) current.next = null;
        else current.next = next.next;

        return head;
    }
}
