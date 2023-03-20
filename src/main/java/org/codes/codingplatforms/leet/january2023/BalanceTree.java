package org.codes.codingplatforms.leet.january2023;


public class BalanceTree {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(3);
        TreeNode t2=new TreeNode(9);
        TreeNode t3=new TreeNode(20);
        TreeNode t4=new TreeNode(15);
        TreeNode t5=new TreeNode(7);
        t1.left=t2;
        t1.right=t3;
        t3.left=t4;
        t3.right=t5;
        BalanceTree b=new BalanceTree();
        System.out.println(b.isBalanced(t1));

    }
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        findHight(root);
        return flag;

    }
    private int findHight(TreeNode root)
    {
        int leftheight=0;
        int rightheight=0;
        if(root.left==null)
        {
            leftheight=1;
        }
        else {
            leftheight=findHight(root.left);
        }

        if(root.right==null)
        {
            rightheight=1;
        }


        else
        {
            rightheight=findHight(root.right);
        }

        if(Math.abs(leftheight-rightheight)>1)
        {
            flag=false;
        }
        return Math.max(leftheight,rightheight)+1;
    }
}
