package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.april.CreateTree;
import org.codes.codingplatforms.leet.april.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDistance {
    public static void main(String[] args) {
        TreeNode root= CreateTree.insertLevelOrder(new int[]{1,0,48,Integer.MIN_VALUE,Integer.MIN_VALUE,12,49},0);
        MinimumAbsoluteDistance m=new MinimumAbsoluteDistance();
        m.getMinimumDifference(root);
    }

    int currData=Integer.MAX_VALUE;
    int prevData=Integer.MAX_VALUE;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);

        return min;

    }
    public void traverse(TreeNode root)
    {
        if(root.left!=null)
        {
            traverse(root.left);
        }
        if(prevData==Integer.MAX_VALUE&&currData==Integer.MAX_VALUE)
        {
            currData=root.val;
            prevData=root.val;
        }
        else {
            currData=root.val;
            if(currData-prevData<min)
            {
                min=currData-prevData;
                prevData=currData;
            }
        }

        if(root.right!=null)
        {
            traverse(root.right);
        }
    }
}
