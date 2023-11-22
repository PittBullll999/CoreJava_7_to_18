package org.codes.codingplatforms.gfg.Month8;

import java.util.Arrays;

public class MinimumSwap {
    public static void main(String[] args) {
        MinimumSwap m=new MinimumSwap();
        m.minSwaps(new int[]{2,8,5,4});
    }
    public int minSwaps(int nums[])
    {
        int t[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(t);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(t[i]!=nums[i])
            {
                count+=1;
            }
        }
        return count/2;

    }
}
