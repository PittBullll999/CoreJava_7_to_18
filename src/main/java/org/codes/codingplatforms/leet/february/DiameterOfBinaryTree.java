package org.codes.codingplatforms.leet.february;

public class DiameterOfBinaryTree {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        return calcDiameter(root);

    }
    private int calcDiameter(TreeNode node)
    {
        int leftPath=0;
        int rightPath=0;
        if(node==null)
        {
            return 0;
        }

        if(node.left!=null)
        {
            leftPath=calcDiameter(node.left);
        }
        if(node.right!=null)
        {
            rightPath=calcDiameter(node.right);
        }
        if(leftPath+rightPath>diameter)
        {
            diameter=leftPath+rightPath;
        }
        int averagePathSum=Math.max(leftPath,rightPath);
        return (averagePathSum+1);
    }
}
