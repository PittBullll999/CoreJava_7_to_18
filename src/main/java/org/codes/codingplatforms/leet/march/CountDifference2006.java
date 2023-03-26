package org.codes.codingplatforms.leet.march;

import java.util.*;

public class CountDifference2006 {
    public static void main(String[] args) {
        countKDifference(new int[]{1,2,2,1},1);
    }
    public static int countKDifference(int[] nums, int k) {
        int n=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int p=entry.getKey();
            n+=map.getOrDefault(p-k,0)+map.getOrDefault(p+k,0);
            map.put(p,map.get(p)-1);
        }
        return n;
    }
}
