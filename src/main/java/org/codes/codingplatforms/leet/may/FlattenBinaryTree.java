package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.april.CreateTree;
import org.codes.codingplatforms.leet.april.TreeNode;

import java.util.Stack;

public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode head=CreateTree.insertLevelOrder(new int[]{1,2,5,3,4,Integer.MIN_VALUE,6},0);
        FlattenBinaryTree f=new FlattenBinaryTree();
        f.flatten(head);
    }
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode head=null;
        TreeNode curr=null;
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode node=stack.pop();


            if(node.right!=null)
            {
                stack.push(node.right);
            }
            if(node.left!=null)
            {
                stack.push(node.left);
            }
            if(head==null&&curr==null)
            {
                head=node;
                curr=node;
            }
            else {
                curr.left=null;
                curr.right=node;
                curr=curr.right;
            }
        }
        //CreateTree.printPreOrder(head);

    }
}
