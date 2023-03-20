package org.codes.codingplatforms.leet.march;

import org.codes.datastructures.Tr;

public class MaximumWidthOfBinaryTree {
    int leftPos=0;
    int rightPos=0;
    public int widthOfBinaryTree(TreeNode root) {
        findWidth(root,0);
        return rightPos-leftPos;


    }
    private void findWidth(TreeNode node,int pos)
    {
        if(pos<leftPos)
        {
            leftPos=pos;
        }
        if(pos>rightPos)
        {
            rightPos=pos;
        }
        if(node.right!=null)
        {
            findWidth(node.right,pos+1);
        }
        if(node.left!=null)
        {
            findWidth(node.left,pos-1);
        }

    }
}
