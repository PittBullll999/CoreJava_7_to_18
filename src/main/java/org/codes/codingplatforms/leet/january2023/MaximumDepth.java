package org.codes.codingplatforms.leet.january2023;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumDepth {
    SortedSet<Integer> set=new TreeSet<>();
    public int maxDepth(TreeNode root) {

        calcDepth(root,1);
        return set.last();
    }
    private void calcDepth(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }

        set.add(level);
        if(root.left!=null)
        {
            calcDepth(root.left,level+1);
        }
        if(root.right!=null)
        {
            calcDepth(root.right,level+1);
        }

    }
}
