package org.codes.codingplatforms.leet.february;



public class Sum_of_Root_To_Leaf_Binary_Numbers {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        traverse(root,"");
        return sum;

    }
    private void traverse(TreeNode node,String s)
    {
        s+=String.valueOf(node.val);
        if(node.left==null&&node.right==null)
        {
            sum+=Integer.parseInt(s,2);
        }
        if(node.right!=null)
        {
            traverse(node.right,s);
        }
        if(node.left!=null)
        {
            traverse(node.left,s);
        }
    }
}
