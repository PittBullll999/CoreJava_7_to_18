package org.codes.codingplatforms.leet.april;

public class MnimumDepthBST {
    int max=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        traverse(root,0);
        return max;

    }
    private void traverse(TreeNode node,int level)
    {
        if(node.left==null&&node.right==null)
        {
            if(max>level)
            {
                max=level;
            }
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
