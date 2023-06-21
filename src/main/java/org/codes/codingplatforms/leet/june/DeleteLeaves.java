package org.codes.codingplatforms.leet.june;

import org.codes.codingplatforms.leet.april.TreeNode;

import java.util.Stack;

public class DeleteLeaves {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(1);
        TreeNode node3=new TreeNode(1);
//        TreeNode node4=new TreeNode(2);
//        TreeNode node5=new TreeNode(2);
//        TreeNode node6=new TreeNode(4);
        node1.left=node2;
        node1.right=node3;
//        node2.left=node4;
//        node3.left=node5;
//        node3.right=node6;
        DeleteLeaves d=new DeleteLeaves();
        d.removeLeafNodes(node1,1);
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null)
        {
            return null;
        }
        recuTree(root,target,null,1);
        return root;

    }
    public void recuTree(TreeNode root,int target,TreeNode parentNode,int side)
    {
        if(root.left!=null)
        {
            recuTree(root.left,target,root,0);
        }
        if(root.right!=null)
        {
            recuTree(root.right,target,root,1);
        }
        if(root.left==null&&root.right==null&&root.val==target)
        {
            if(parentNode==null)
            {
                root=null;
            }
            if(side==0)
            {
                parentNode.left=null;
            }
            else {
                parentNode.right=null;
            }
        }
    }
}
