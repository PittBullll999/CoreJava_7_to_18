package org.codes.codingplatforms.interviewbit.april;



public class KthSmallestElementInBST {
    public static void main(String[] args) {
        TreeNode head= CreateTree.insertLevelOrder(new int[]{2,1,3},0);
        KthSmallestElementInBST k=new KthSmallestElementInBST();
        k.kthsmallest(head,2);
    }
    int count=1;
    int num;
    public int kthsmallest(TreeNode A, int B) {
        traverse(A,B);
        return num;
    }
    public void traverse(TreeNode node,int b)
    {
        if(node.left!=null)
        {
            traverse(node.left,b);
        }
        if(count==b)
        {
            num=node.val;
        }
        count+=1;
        if(node.right!=null)
        {
            traverse(node.right,b);
        }
    }
}
