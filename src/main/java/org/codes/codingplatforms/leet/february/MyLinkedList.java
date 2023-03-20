package org.codes.codingplatforms.leet.february;



class ListNode{
    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }

    int data;
    ListNode next;
}
public class MyLinkedList {
    ListNode head;
    ListNode tail;


    public MyLinkedList() {
        this.head=null;
        this.tail=head;

    }

    public int get(int index) {
        if(index==0)
        {
            return head.data;
        }
        else {
            ListNode temp=head;
            while (index>0&&temp.next!=null)
            {
                temp=temp.next;
                index-=1;
            }
            return temp.data;
        }

    }

    public void addAtHead(int val) {
        if(head==null&&tail==null)
        {
            ListNode l=new ListNode(val);
            l.next=null;
            head=l;
            tail=l;
        }
        else {
            ListNode l=new ListNode(val);
            l.next=head;
            head=l;
        }

    }

    public void addAtTail(int val) {
        if(head==null&&tail==null)
        {
            ListNode l=new ListNode(val);
            l.next=null;
            head=l;
            tail=l;
        }
        else {
            ListNode l=new ListNode(val);
            tail.next=l;
            tail=l;
        }

    }

    public void addAtIndex(int index, int val) {
        if(index==0)
        {
            addAtHead(val);

        }
        else {
            ListNode temp1=head;
            ListNode temp2=head;
            while(index>0&&temp2.next!=null)
            {
                temp1=temp2;
                temp2=temp2.next;
                index-=1;

            }
            ListNode l=new ListNode(val);
            temp1.next=l;
            l.next=temp2;


        }


    }

    public void deleteAtIndex(int index) {
        if(index==0)
        {
            head=head.next;
        }
        else {
            ListNode temp1=head;
            ListNode temp2=head;
            while(index>0)
            {
                temp2=temp1;
                temp1=temp1.next;
                index-=1;
            }
            temp2.next=temp1.next;
        }

    }
}
