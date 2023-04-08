package org.codes.codingplatforms.leet.april;

import org.codes.codingplatforms.leet.march.ListNode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DuplicateRemovalList {
    public static void main(String[] args) {
        ListNode head=ListNode.createLinkedList(new int[]{1,1,2});
        DuplicateRemovalList d=new DuplicateRemovalList();
        d.deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempnode=head;
        ListNode temp1=head;
        SortedSet<Integer> set=new TreeSet<>();

        while (tempnode!=null)
        {
            set.add(tempnode.val);
            tempnode=tempnode.next;
        }

        int t[]=new int[set.size()];
        AtomicInteger j= new AtomicInteger();
        set.stream().forEach(i->{
            t[j.get()]=(int) i;
            j.addAndGet(1);
        });
         ListNode tt=createLinkedList(t);
         return tt;


    }
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
}
