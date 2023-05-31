package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.march.ListNode;

import java.util.List;

public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        ListNode head=ListNode.createLinkedList(new int[]{7,7,7,7,});
        RemoveElementFromLinkedList r=new RemoveElementFromLinkedList();
        r.removeElements(head,7);
    }
    public ListNode removeElements(ListNode head, int dat) {
        if(head==null)
        {
            return(head);
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            if(curr.val==dat)
            {
                if(prev==null)
                {
                    head=head.next;
                    curr=head;
                    continue;
                }
                else if(curr.next==null)
                {
                    prev.next=null;
                    curr=null;
                }
                else {
                    prev.next=curr.next;
                    curr=curr.next;
                }
            }
            else {
                prev=curr;
                curr=curr.next;
            }
        }
        return head;


    }
}
