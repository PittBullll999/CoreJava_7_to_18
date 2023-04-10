package org.codes.codingplatforms.leet.april;

import org.codes.codingplatforms.leet.march.ListNode;

import java.util.List;

public class RemoveDuplicates83 {
    public static void main(String[] args) {
        ListNode head =ListNode.createLinkedList(new int[]{1,1,2});
        RemoveDuplicates83 r=new RemoveDuplicates83();
        r.deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp1=head;
        ListNode first=head;
        ListNode right=head.next;
        while (right.next!=null)
        {
            if(first.val!= right.val)
            {
                first.next=right;
                first=right;
                right=first.next;
            }
            else {
                right=right.next;
            }
        }
        first.next=null;
        return head;
    }

    }
