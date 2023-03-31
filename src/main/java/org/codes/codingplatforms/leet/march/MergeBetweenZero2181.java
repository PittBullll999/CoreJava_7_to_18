package org.codes.codingplatforms.leet.march;


public class MergeBetweenZero2181 {
    //[0,3,1,0,4,5,2,0]
    public static void main(String[] args) {
        ListNode node1=new ListNode(0);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(1);
        ListNode node4=new ListNode(0);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(2);
        ListNode node8=new ListNode(0);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        MergeBetweenZero2181 m=new MergeBetweenZero2181();
        m.mergeNodes(node1);
    }
    public ListNode mergeNodes(ListNode head) {

        ListNode temp;
        ListNode head1;
        ListNode left=head;
        ListNode right=head;
        int sum=0;
        while(right.next!=null)
        {
            if(right.next.val==0)
            {
                right.val+=sum;
                sum=0;
                left.next=right;
                right=right.next;
                left=right;
            }
            else {
                sum+=right.val;
                right=right.next;
            }
        }
        temp=head.next;
        head1=head.next;
        while(temp.next.next!=null)
        {
            //System.out.println(temp.val);
            temp.next=temp.next.next;
            temp=temp.next;
        }
        temp.next=null;
        return head1;

    }
}
