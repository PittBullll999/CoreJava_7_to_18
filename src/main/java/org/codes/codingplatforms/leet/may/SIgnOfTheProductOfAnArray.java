package org.codes.codingplatforms.leet.may;

public class SIgnOfTheProductOfAnArray {
    public static void main(String[] args) {
        SIgnOfTheProductOfAnArray s=new SIgnOfTheProductOfAnArray();
        s.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41});
    }
    public int arraySign(int[] nums) {
        double prod=1;
        for(int i=0;i<nums.length;i++)
        {
            prod=prod*nums[i];
        }
        if(prod>0)
        {
            return 1;
        }
        else if(prod==0)
        {
            return 0;
        }
        else{
            return -1;
        }

    }
}
