package org.example;

import java.util.List;

public class RotateList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k == 0) return head;

        ListNode current = head;

        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }

        if(length == 1 || k == length) return head;

        k = k%length;
        if(k == 0) return head;

        current = head;

        for(int i =0 ;i<length-k-1;i++){
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;

        current = newHead;

        while(current!=null && current.next!=null){
            current = current.next;
        }

        if(current!=null) current.next = head;

        return newHead;
    }
}
