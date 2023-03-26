package org.codes.codingplatforms.leet.march;

public class CountNodesEqual2265 {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(1);
        TreeNode node4=new TreeNode(3);


        node1.right=node2;
        node2.right=node3;
        node3.right=node4;

        CountNodesEqual2265 c=new CountNodesEqual2265();
        c.averageOfSubtree(node1);

    }
    int count=0;
    public int averageOfSubtree(TreeNode root) {

        traverse(root);

        return count;



    }
    private int traverse(TreeNode node)
    {
        int leftNode_val=0;
        int rightNode_val=0;
        int leftCount=0;
        int rightCount=0;
        int average=0;
        if(node.left!=null)
        {
            leftCount=1;
            leftNode_val=traverse(node.left);

        }
        if(node.right!=null)
        {
            rightCount=1;
            rightNode_val=traverse(node.right);

        }
        average=(node.val+leftNode_val+rightNode_val)/(1+leftCount+rightCount);
        if(average==node.val)
        {
            count+=1;
        }
        return average;

    }
}
