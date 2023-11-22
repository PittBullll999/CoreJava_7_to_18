package org.codes.codingplatforms.gfg.Month8;


class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class Delete_Node_From_LinkeList {
    Node deleteNode(Node head, int x)
    {
        // Your code here
        int pos=1;
        Node prev=null;
        Node curr=head;
        while (pos<x)
        {
            prev=curr;
            curr=curr.next;
            pos+=1;

        }
        if(prev==null)
        {
            head=head.next;
        }
        else if(prev!=null)
        {
            prev.next=curr.next;
            curr.next=null;
        }
        return head;
    }
}
