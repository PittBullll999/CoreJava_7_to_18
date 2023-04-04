package org.codes.codingplatforms.interviewbit.april;


import com.sun.source.tree.Tree;

import java.util.Stack;

public class ValidBinaryTree {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        node1.left=node2;
        node1.right=node3;
        node3.left=node4;
        ValidBinaryTree v=new ValidBinaryTree();
        v.isValidBST(node1);

    }
    public int isValidBST(TreeNode A) {
        boolean b=traverse(A);
        if(b)
        {
            return 1;
        }
        return 0;

    }
    public boolean traverse(TreeNode node)
    {
        boolean left=true;
        boolean right=true;
        if(node.left!=null)
        {
            left=(node.val>node.left.val)&&traverse(node.left);
        }
        if(node.right!=null)
        {
            right=(node.val<node.right.val)&&traverse(node.right);
        }
        return left&&right;

    }
}
