package org.codes.codingplatforms.leet.january2023;

public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return null;

    }

    private int max(int start,int end,int[] nums)
    {
        int m=0;
        int pos=0;
        for(int i=start;i<end;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                pos=i;
            }
        }
        return pos;
    }
}
