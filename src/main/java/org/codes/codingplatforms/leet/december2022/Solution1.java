package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;

class Solution1 {
    public static void main(String[] args) {
        int p[]=new int[]{1,1,0,1,1,1,1,1,0,1,1,1,1};

        int t=(findMaxConsecutiveOnes(p));
        System.out.println(".....................");
        System.out.println(t);


    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int m=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                nums[i]=nums[i-1]+1;
                if(nums[i]>m)
                {
                    m=nums[i];
                }
            }
            else
            {
                continue;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        return m;

    }
}