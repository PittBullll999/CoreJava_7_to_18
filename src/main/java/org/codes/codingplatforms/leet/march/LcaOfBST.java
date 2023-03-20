package org.codes.codingplatforms.leet.march;

public class LcaOfBST {
    public static void main(String[] args) {
        TreeNode node3=new TreeNode(3);
        TreeNode node5=new TreeNode(5);
        TreeNode node1=new TreeNode(1);
        TreeNode node6=new TreeNode(6);
        TreeNode node2=new TreeNode(2);
        TreeNode node0=new TreeNode(0);
        TreeNode node8=new TreeNode(8);
        node3.left=node5;
        node3.right=node1;
        node5.left=node6;
        node5.right=node2;
        node1.left=node0;
        node1.right=node8;
        LcaOfBST l=new LcaOfBST();
        l.lowestCommonAncestor(node3,node6,node1);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLca(root,p,q);

    }
    private TreeNode findLca(TreeNode root,TreeNode p,TreeNode q)
    {
       TreeNode t1=null;
       TreeNode t2=null;
        if(root==p)
        {
            return p;
        }
        if(root==q)
        {
            return q;
        }
        if(root.left!=null)
        {
            t1=findLca(root.left,p,q);
        }
        if(root.right!=null)
        {
            t2=findLca(root.right,p,q);
        }
        if(t1==null&&t2==null)
        {
            return null;
        }
        if(t1==null)
        {
            return t2;
        }
        if(t2==null)
        {
            return t1;
        }
        else return root;
    }


}
