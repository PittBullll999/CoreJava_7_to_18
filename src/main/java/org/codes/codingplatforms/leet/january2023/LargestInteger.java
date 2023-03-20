package org.codes.codingplatforms.leet.january2023;

import java.util.Arrays;

public class LargestInteger {
    public static void main(String[] args) {
        LargestInteger l=new LargestInteger();
        System.out.println(l.findMaxK(new int[]{-11}));
    }
    public int findMaxK(int[] nums) {
        int pos[]=new int[Math.abs(Arrays.stream(nums).max().getAsInt())+1];
        int neg[]=new int[Math.abs(Arrays.stream(nums).min().getAsInt())+1];
        for(int i:nums)
        {
            if(i>=0)
            {
                pos[i]+=1;
            }
            else{
                neg[-i]+=1;
            }
        }

//        Arrays.stream(pos).forEach(i-> System.out.print(i+" "));
//        System.out.println();
//        Arrays.stream(neg).forEach(i-> System.out.print(i+" "));
        int max=-1;
        if(pos.length<neg.length)
        {
            for(int i=0;i<pos.length;i++)
            {
                if(pos[i]==1&&neg[i]==1)
                {
                    max=i;
                }
            }
        }
        else {
            for(int i=0;i<neg.length;i++)
            {
                if(pos[i]==1&&neg[i]==1)
                {
                    max=i;
                }
            }

        }
        return max;
    }
}
