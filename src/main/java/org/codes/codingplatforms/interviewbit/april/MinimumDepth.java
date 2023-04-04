package org.codes.codingplatforms.interviewbit.april;

import org.codes.datastructures.Tr;

public class MinimumDepth {
    int m=Integer.MAX_VALUE;
    public int minDepth(TreeNode A) {
        if(A==null)
        {
            return 0;
        }
        traverse(A,1);
        return m;
    }
    private void traverse(TreeNode node,int level)
    {
        if(node.left==null&&node.right==null)
        {
            if(level<m)
            {
                m=level;

            }
            return;
        }
        if(node.left!=null)
        {
            traverse(node.left,level+1);
        }
        if(node.right!=null)
        {
            traverse(node.right,level+1);
        }
    }
}
