package org.codes.codingplatforms.leet.february;

public class EvenGrantParents {
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        findSum(root,false);
        return sum;

    }
    private void findSum(TreeNode node,boolean evenParent)
    {
        if(evenParent)
        {
            if(node.left!=null)
            {
                sum+=node.left.val;
            }
            if(node.right!=null)
            {
                sum+=node.right.val;
            }
        }
        if(node.right!=null)
        {
            findSum(node.right,node.val%2==0);
        }
        if(node.left!=null)
        {
            findSum(node.left,node.val%2==0);
        }
    }
}
