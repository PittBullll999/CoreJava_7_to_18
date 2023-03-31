package org.codes.codingplatforms.interviewbit.march;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public int[] inorderTraversal(TreeNode A) {
        List<Integer> list=new ArrayList<>();
        traverse(A,list);
        int t[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            t[i]=list.get(i);
        }
        return t;


    }
    private void traverse(TreeNode node,List<Integer> list)
    {
        if(node.left!=null)
        {
            traverse(node.left,list);
        }
        list.add(node.val);
        if(node.right!=null)
        {
            traverse(node.right,list);
        }
    }
}
