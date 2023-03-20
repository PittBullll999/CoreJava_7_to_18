package org.codes.codingplatforms.leet.january2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDecreasingSubSequences {
    public static void main(String[] args) {
        int t[]=new int[]{4,6,7,7};
        findSubsequences(t);
    }
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> newlist=new ArrayList<>();
            newlist.add(nums[i]);
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>=nums[j-1])
                {
                    newlist.add(nums[j]);
                    System.out.println(newlist.toString());
                    list.add(newlist);
                }
                else {
                    break;
                }
            }

        }
        return list;

    }
}
