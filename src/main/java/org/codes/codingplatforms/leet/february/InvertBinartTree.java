package org.codes.codingplatforms.leet.february;

public class InvertBinartTree {
    public TreeNode invertTree(TreeNode root) {
            invertTree(root);
            return root;
    }
    private void invert(TreeNode node)
    {
        if(node.right==null&&node.left==null)
        {
            return;
        }
        if(node.right!=null&&node.left!=null)
        {
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            invert(node.left);
            invert(node.left);
        }
        if(node.left==null)
        {
            node.left=node.right;
            invert(node.left);
        }
        if(node.right==null)
        {
            node.right=node.left;
            invert(node.right);
        }
    }
}
