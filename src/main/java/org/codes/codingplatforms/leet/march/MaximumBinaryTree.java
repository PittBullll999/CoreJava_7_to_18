package org.codes.codingplatforms.leet.march;

public class MaximumBinaryTree {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {

        fetchMax(root,root.val);
        return null;
    }
    private boolean fetchMax(TreeNode node,int parentValue)
    {
        boolean t=node.val<parentValue;
        if(!t)
        {
            return false;
        }
        boolean left=true;
        boolean right=true;

        if(node.left!=null)
        {
            left=fetchMax(node.left,node.val);
        }
        if(node.right!=null)
        {
            right=fetchMax(node.right,node.val);
        }
        return (t&&left&&right);
    }
}
