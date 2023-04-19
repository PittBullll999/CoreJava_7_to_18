package org.codes.codingplatforms.leet.april;

import org.codes.datastructures.Tr;

import java.util.Stack;

public class UnivaluedBinaryTree {
    boolean flag=true;
    public boolean isUnivalTree(TreeNode root) {


        return traverse(root,root.val);
    }
    private boolean traverse(TreeNode node,int parentVal)
    {
        boolean right=true;
        boolean left=true;
        boolean parent=(node.val==parentVal);
        if(node.left!=null)
        {
            left=traverse(node.left,node.val);
        }
        if(node.right!=null)
        {
            right=traverse(node.right,node.val);
        }
        return (right&&left&&parent);

    }
    private boolean bst(TreeNode node)
    {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(node);
        while (stack.isEmpty())
        {
            TreeNode node1=stack.pop();
            int val=node1.val;
            int k=val;
            int j=val;
            if(node1.left!=null)
            {
                k=node1.left.val;
                stack.push(node1.left);

            }
            if(node1.right!=null)
            {
                j=node1.right.val;
                stack.push(node1.right);
            }
            if(val!=k||val!=j)
            {
                return false;
            }
        }
        return true;
    }

}
