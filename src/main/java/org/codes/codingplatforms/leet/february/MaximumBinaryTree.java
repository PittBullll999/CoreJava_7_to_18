package org.codes.codingplatforms.leet.february;



public class MaximumBinaryTree {
    public static void main(String[] args) {
        int nums[]=new int[]{3,2,1,6,0,5};
        MaximumBinaryTree m=new MaximumBinaryTree();
        System.out.println(m.buildTree(nums));
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums);

    }
    private TreeNode buildTree(int[] array)
    {
        if(array.length==0)
        {
            return null;
        }
        int max=-1;
        int pos=-1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
                pos=i;
            }
        }
        int[] t=new int[pos];
        int[] k=new int[array.length-pos-1];
        int i=0;
        while (i<array.length)
        {
            if(i<pos)
            {
                t[i]=array[i];

            }
            if(i>pos)
            {
                k[i-pos-1]=array[i];

            }
            i+=1;
        }
        TreeNode node=new TreeNode(array[pos]);
        node.left=buildTree(t);
        node.right=buildTree(k);
        return node;

    }
}
