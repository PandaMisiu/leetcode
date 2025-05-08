package org.example;

public class LinkedListCycleII {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    // Floyd's tortoise and hare
    public ListNode detectCycle(ListNode head)  {
        ListNode tortoise = head, hare = head;
        boolean hasCycle = false;

        while(hare!=null){
            tortoise = tortoise.next;
            hare = hare.next;
            if(hare == null) break;
            hare = hare.next;

            if(hare == tortoise){
                hasCycle = true;
                break;
            }
        }
        if(hasCycle){
            tortoise = head;
            while (true){
                if(hare == tortoise){
                    return hare;
                }

                tortoise = tortoise.next;
                hare = hare.next;
            }
        }

        return null;
    }
}
