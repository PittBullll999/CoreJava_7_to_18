package org.codes.codingplatforms.leet.december2022;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n=(int)Math.floor(nums.length/2);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else{
                hashMap.put(nums[i],1 );
            }
            if(hashMap.get(nums[i])>n)
            {
                return nums[i];
            }
        }
        return(nums[0]);
    }
}
