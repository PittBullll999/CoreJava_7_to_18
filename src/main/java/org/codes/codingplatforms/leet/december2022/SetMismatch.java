package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int t[]=new int[]{1,2,2,4};
        Arrays.stream(findErrorNums(t)).forEach(System.out::println);
    }
    public static int[] findErrorNums(int[] nums) {
        int t[]=new int[nums.length+2];

        for(int i:nums)
        {

            t[i]+=1;

        }
        int k[]=new int[2];
        for(int i=1;i<nums.length+1;i++)
        {
            if(t[i]>1)
            {
                k[0]=i;
            }
            if(t[i]==0)
            {
                k[1]=i;
            }
        }
        return(k);

    }
}
