package org.codes.codingplatforms.leet.february;

import com.sun.source.tree.Tree;

import java.util.Map;

public class MaxPathSum {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(-2);
        TreeNode node3=new TreeNode(-3);
        node1.right=node2;
        node1.left=node3;
        MaxPathSum m=new MaxPathSum();
        System.out.println(m.maxPathSum(node1));
    }
    int max=-1000;
    public int maxPathSum(TreeNode root) {
        path(root);
        return max;


    }
    private int path(TreeNode root)
    {
        int totalPath=root.val;
        int left=0;
        int right=0;
        if(root.left!=null)
        {
            int k=path(root.left);
            if(0<k)
            {
                left=k;
            }


        }
        if(root.right!=null)
        {
            int k=path(root.right);
            if(0<k)
            {
                right=k;
            }

        }
        if((totalPath+left+right)>max)
        {
            max=totalPath+left+right;
        }
        return Math.max(totalPath+right,totalPath+left);

    }

}
