package org.codes.codingplatforms.leet.march;

public class SlidingWindowMax {
    public static void main(String[] args) {
        SlidingWindowMax s=new SlidingWindowMax();
        s.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int pos=0;
        int t[]=new int[nums.length-k];
        for(int i=0;i<k;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                pos=i;
            }
        }
        t[0]=max;
        int lpos=1;
        int rpos=k;
        while(rpos<nums.length)
        {
            if(nums[rpos]>=max)
            {
                pos=rpos;
                max=nums[rpos];
            }
        }
        return nums;
    }
}
