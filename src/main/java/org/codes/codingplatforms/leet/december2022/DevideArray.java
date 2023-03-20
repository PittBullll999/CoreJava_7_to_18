package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;

public class DevideArray {
    public static void main(String[] args) {
        int k[]=new int[]{2,2,3,3,1,6};
        System.out.println(divideArray(k));

    }
    public static boolean divideArray(int[] nums) {
        int n=nums.length;
        int max= Arrays.stream(nums).max().getAsInt();
        int[] k=new int[max+1];
        for(int i=0;i<n;i++)
        {
            k[nums[i]]+=1;
        }
        for(int i=0;i<k.length;i++)
        {
            if(k[i]%2!=0)
            {
                return false;
            }
        }

        return true;


    }
}
