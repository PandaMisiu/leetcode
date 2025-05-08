package org.example;

public class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(0), moreDummy = new ListNode(0),
                current = head,lessDummyHead = lessDummy, moreDummyHead = moreDummy;
        while(current != null){
            if(current.val < x){
                lessDummy.next = current;
                lessDummy = lessDummy.next;
            } else {
                moreDummy.next = current;
                moreDummy = moreDummy.next;
            }

            current = current.next;
        }

        moreDummy.next = null;
        lessDummy.next = moreDummyHead.next;

        return lessDummyHead.next;
    }

}
