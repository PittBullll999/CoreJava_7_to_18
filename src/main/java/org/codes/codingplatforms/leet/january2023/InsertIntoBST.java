package org.codes.codingplatforms.leet.january2023;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root,val);
        return root;

    }
    private void insert(TreeNode root,int value)
    {
        if(value<root.val&&root.left!=null)
        {
            insert(root.left,value);
        }
        if(value>root.val&&root.right!=null)
        {
            insert(root.right,value);
        }
        if(value>root.val&&root.right==null)
        {
            TreeNode treeNode=new TreeNode(value);
            root.right=treeNode;
            return;
        }
        if (value<root.val&&root.left==null)
        {
            TreeNode t=new TreeNode(value);
            root.right=t;
            return;
        }
        return;
    }
}
