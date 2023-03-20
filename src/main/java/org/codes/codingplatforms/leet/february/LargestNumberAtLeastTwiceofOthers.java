package org.codes.codingplatforms.leet.february;


public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int []t=new int[]{0,0,3,2};
        LargestNumberAtLeastTwiceofOthers l=new LargestNumberAtLeastTwiceofOthers();
        System.out.println(l.dominantIndex(t));
    }
    public int dominantIndex(int[] nums) {

            int first=-1;
            int second=-1;
            int pos=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>first)
                {
                    second=first;
                    first=nums[i];
                    pos=i;

                }
                if(nums[i]<first&&nums[i]>second)
                {
                    second=nums[i];
                }
            }
            if(first>=(2*second))
            {
                return pos;
            }
            return -1;

        }
}
