package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.march.ListNode;

import java.util.List;

public class SplitLinkedList725 {
    public static void main(String[] args) {
        ListNode head=ListNode.createLinkedList(new int[]{1,2,3});
        SplitLinkedList725 s=new SplitLinkedList725();
        s.splitListToParts(head,5);
        System.out.println(s.getSizeOfListNode(head));
    }
    //ListNode newhead=null;
    public ListNode[] splitListToParts(ListNode head, int k) {

          int val=getSizeOfListNode(head);
          int minSize=val/k;
          int maxSixe=minSize+1;
          int loopTime=val%k;
          ListNode[] listNodes=new ListNode[k];
          ListNode newHead=head;
          for(int i=0;i<k;i++)
          {
              if(i<loopTime)
              {
                  newHead=makePartition(listNodes,newHead,maxSixe,i);
              }
              else {
                  newHead=makePartition(listNodes,newHead,minSize,i);
              }

          }
          return listNodes;


    }
    private int getSizeOfListNode(ListNode head)
    {
        int size=0;
        if(head==null)
        {
            return 0;

        }
        else {
            size+=1;
            while (head.next!=null)
            {

                head=head.next;
                size+=1;
            }
            return size;
        }
    }
    public ListNode makePartition(ListNode[] listNodes,ListNode head,int size,int i)
    {
        if(size==0)
        {
            listNodes[i]=null;
            return head;
        }
        int count=0;
        ListNode node1=head;
        ListNode node2=head;
        ListNode temp=head;
        while (count<size)
        {
            count+=1;

            if(count==size)
            {
                node1=temp.next;
                temp.next=null;
                listNodes[i]=node2;
            }
            temp=temp.next;


        }

        return node1;
    }
}
