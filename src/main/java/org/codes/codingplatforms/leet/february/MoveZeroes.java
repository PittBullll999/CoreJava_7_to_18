package org.codes.codingplatforms.leet.february;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] s=new int[]{0,1,0,3,12};
        MoveZeroes m=new MoveZeroes();
        m.moveZeroes(s);
    }
    public void moveZeroes(int[] nums) {
        int zeroCount=0;
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
//            if(nums[i]==0)
//            {
//                zeroCount+=1;
//            }
            if(nums[i]!=0) {
                nums[pos]=nums[i];
                pos+=1;
            }
        }
        for(int i=pos;i<nums.length;i++)
        {
            nums[i]=0;
        }

    }
}
