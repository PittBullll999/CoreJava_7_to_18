package org.codes.codingplatforms.leet.january2023;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SearchInABinaryTree {
    //stack
    public TreeNode searchBST(TreeNode root, int value) {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(stack.size()==0)
        {
            TreeNode t=stack.pop();
            if(t.val==value)
            {
                return t;
            }
            if(t.right!=null)
            {
                stack.push(t.right);
            }
            if(t.left!=null)
            {
                stack.push(t.left);
            }


        }
        return null;


    }
    //Queue
    public TreeNode searchBST1(TreeNode root, int value) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (queue.size()>0)
        {
            TreeNode t=queue.remove();
            if(t.val==value)
            {
                return t;
            }
            queue.add(t.left);
            queue.add(t.right);
        }
        return null;

    }


}
