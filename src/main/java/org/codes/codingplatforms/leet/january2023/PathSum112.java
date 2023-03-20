package org.codes.codingplatforms.leet.january2023;

public class PathSum112 {
    boolean status=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traverse(root,targetSum,0);
        return status;

    }
    private void traverse(TreeNode root,int targetSum,int currentSum)
    {
        if(root.val+currentSum==targetSum)
        {
            status=true;
        }
        if(root.val+currentSum>targetSum)
        {
            return;
        }
        traverse(root.left,targetSum,currentSum+root.val);
        traverse(root.right,targetSum,currentSum+root.val);

    }

}
