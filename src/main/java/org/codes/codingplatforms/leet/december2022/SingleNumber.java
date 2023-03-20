package org.codes.codingplatforms.leet.december2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]=new int[]{1,1,2,3,4,5};
        singleNumber(nums);

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else {
                hashMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return -1;

    }
}
