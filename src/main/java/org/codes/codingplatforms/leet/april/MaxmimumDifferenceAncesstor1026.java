package org.codes.codingplatforms.leet.april;

public class MaxmimumDifferenceAncesstor1026 {
    int max=0;
    public static void main(String[] args) {
        TreeNode root=CreateTree.insertLevelOrder(new int[]{1,Integer.MIN_VALUE,2,Integer.MIN_VALUE,0,3},0);
        MaxmimumDifferenceAncesstor1026 m=new MaxmimumDifferenceAncesstor1026();
        m.maxAncestorDiff(root);
    }
    public int maxAncestorDiff(TreeNode root) {

        traverse(root,Integer.toString(root.val));
        return max;

    }
    private void traverse(TreeNode node, String ancestors)
    {
        String t[]=ancestors.split(" ");
        int k[]=new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            k[i]=Integer.parseInt(t[i]);
        }
        for(int i:k)
        {
            if(Math.abs(node.val-i)>max)
            {
                max=Math.abs(node.val-i);
            }
        }

        if(node.left!=null)
        {
            traverse(node.left,ancestors+" "+node.val);
        }
        if(node.right!=null)
        {
            traverse(node.right,ancestors+" "+node.val);
        }
    }
}
