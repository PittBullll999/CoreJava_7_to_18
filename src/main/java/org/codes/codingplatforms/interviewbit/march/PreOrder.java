package org.codes.codingplatforms.interviewbit.march;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public int[] preorderTraversal(TreeNode A) {
        List<Integer> list=new ArrayList();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(A);
        while(!stack.isEmpty())
        {
            TreeNode t=stack.pop();
            list.add(t.val);
            if(t.right!=null)
            {
                stack.push(t.right);
            }
            if(t.left!=null) {

                stack.push(t.left);
            }
        }
        int t[]=new int[list.size()];
        for(int i=0;i< t.length;i++)
        {
            t[i]=list.get(i);
        }
        return t;

    }
}
