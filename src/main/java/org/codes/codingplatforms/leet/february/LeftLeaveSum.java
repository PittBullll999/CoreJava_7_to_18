package org.codes.codingplatforms.leet.february;




public class LeftLeaveSum {
    int totalSum=0;

    public int sumOfLeftLeaves(TreeNode root) {
        checkSum(root,false);
        return totalSum;

    }
    private void checkSum(TreeNode root,boolean isLeft)
    {
        if(root.left==null&&root.right==null&&isLeft)
        {
            totalSum+=root.val;
            return;
        }
        if(root.left!=null)
        {
            checkSum(root.left,true);
        }
        if(root.right!=null)
        {
            checkSum(root.right,false);
        }

    }
}
