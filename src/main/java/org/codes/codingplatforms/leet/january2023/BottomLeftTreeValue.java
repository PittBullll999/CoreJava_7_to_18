package org.codes.codingplatforms.leet.january2023;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class BottomLeftTreeValue {
    int t[]=new int[10000];
    int highlevel=0;
    public int findBottomLeftValue(TreeNode root) {
        traverse(root,0);
        return t[highlevel];





    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(t[level]==0)
        {
            t[level]=root.val;
        }
        if(level>highlevel)
        {
            highlevel=level;
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);

    }
}
