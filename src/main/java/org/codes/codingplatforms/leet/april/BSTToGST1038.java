package org.codes.codingplatforms.leet.april;

import org.codes.datastructures.Tr;

public class BSTToGST1038 {
    int tot=0;
    public static void main(String[] args) {
        int p=Integer.MIN_VALUE;
        TreeNode root=CreateTree.insertLevelOrder(new int[]{4,1,6,0,2,5,7,p,p,p,3,p,p,p,8},0);
        BSTToGST1038 b=new BSTToGST1038();
        b.bstToGst(root);

    }
    public TreeNode bstToGst(TreeNode root) {
        tot=findSum(root);
        traverse(root);
        return root;

    }
    private void traverse(TreeNode root)
    {
        if(root.left!=null)
        {
            traverse(root.left);
        }
        int m=root.val;
        root.val=tot;
        tot-=m;
        if(root.right!=null)
        {
            traverse(root.right);
        }
    }
    private int findSum(TreeNode treeNode)
    {
        int t=treeNode.val;
        int left=0;
        int right=0;
        if(treeNode.left!=null)
        {
            left=findSum(treeNode.left);
        }
        if(treeNode.right!=null)
        {
            right=findSum(treeNode.right);
        }
        return left+right+t;
    }
}
