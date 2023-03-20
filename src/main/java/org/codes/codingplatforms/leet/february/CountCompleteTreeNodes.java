package org.codes.codingplatforms.leet.february;



public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return count(root);

    }
    private int count(TreeNode node)
    {
        int left=0;
        int right=0;
        if(node==null)
        {
            return 0;
        }
        if(node.left==null&&node.right==null)
        {
            return 1;
        }
        if(node.left!=null)
        {
            left=count(node.left);
        }
        if(node.right!=null)
        {
            right=count(node.right);
        }
        return left+right+1;
    }
}
