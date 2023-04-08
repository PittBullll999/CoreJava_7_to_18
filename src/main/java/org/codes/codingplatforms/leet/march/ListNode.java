package org.codes.codingplatforms.leet.march;


public class ListNode {

    public static ListNode createLinkedList(int[] arr) {
        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }
        return head;
    }
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}