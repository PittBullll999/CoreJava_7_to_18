package org.codes.codingplatforms.leet.march;

import java.util.HashMap;
import java.util.Map;

public class ReplaceElementInArray2295 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,2};
        //[[1,3],[2,1],[3,2]]
        int operation[][]=new int[][]{{1,3},{2,1},{3,2}};
        ReplaceElementInArray2295 r=new ReplaceElementInArray2295();
        r.arrayChange(nums,operation);
    }
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);

        }
        for(int i=0;i<operations.length;i++)
        {
            int n1=operations[i][0];
            int n2=operations[i][1];
            int pos=map.get(n1);
            map.remove(n1);
            nums[pos]=n2;
            map.put(n2,pos);
        }
        return nums;

    }
}
