package org.codes.codingplatforms.leet.april;

public class SmallestStringFronTree {
    public static void main(String[] args) {
        int a[]=new int[]{4,0,1,1};
        TreeNode root=CreateTree.insertLevelOrder(a,0);
        SmallestStringFronTree s=new SmallestStringFronTree();
        s.smallestFromLeaf(root);
    }
    String smallest=null;
    public String smallestFromLeaf(TreeNode root) {
        traverse(root,"");
        return smallest;


    }
    public void traverse(TreeNode node,String s)
    {
        s+=(char)(node.val+97);
        if(node.left==null&&node.right==null)
        {
            if(smallest==null)
            {
                StringBuilder sb=new StringBuilder(s);
                sb.reverse();
                smallest=sb.toString();
                return;
            }

            else
            {
                StringBuilder sb=new StringBuilder(s);
                sb.reverse();
                String p=sb.toString();
                if(smallest.compareTo(p)>0)
                {
                    smallest=p;

                }
                return;
            }

        }
        if(node.left!=null)
        {
            traverse(node.left,s);
        }
        if(node.right!=null)
        {
            traverse(node.right,s);
        }
    }
}
