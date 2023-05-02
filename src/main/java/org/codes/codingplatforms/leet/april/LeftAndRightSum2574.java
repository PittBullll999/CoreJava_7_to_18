package org.codes.codingplatforms.leet.april;

public class LeftAndRightSum2574 {
    public static void main(String[] args) {
        int nums[]=new int[]{10,4,8,3};
        LeftAndRightSum2574 l=new LeftAndRightSum2574();
        l.leftRigthDifference(nums);
    }
    public int[] leftRigthDifference(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }

        int ans[]=new int[nums.length];
        int leftSum=0;
        int rightSum=sum;
        for(int i=0;i<nums.length;i++)
        {

            rightSum-=nums[i];
            ans[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];


        }
        return ans;

    }
}
