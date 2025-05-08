package org.example;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // brute force
//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> occurences = new HashSet<>();
//
//        while(head!=null){
//            if(occurences.contains(head)) return true;
//            else occurences.add(head);
//            head = head.next;
//        }
//
//        return false;
//    }

    // Floyd's tortoise and hare
    public boolean hasCycle(ListNode head) {
        ListNode tortoise = head, hare = head;

        while(hare!=null){
            tortoise = tortoise.next;
            hare = hare.next;
            if(hare == null) break;
            hare = hare.next;

            if(hare == tortoise) return true;
        }

        return false;
    }
}
