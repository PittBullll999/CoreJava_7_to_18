package org.codes.codingtechnique.dynamicprogramming;

import java.util.HashMap;

public class CanSum {
    HashMap<Integer,Boolean> hashMap=new HashMap<>();
    public static void main(String[] args) {
        CanSum canSum=new CanSum();
        System.out.println(canSum.cansumrecursion(300,new int[]{2,4,5,7,8,9}));

    }
    public boolean cansumrecursion(int target,int[] nums)
    {
        if(target==0)
        {
            return true;
        }
        if(target<0)
        {
            return false;
        }
        for(int n:nums)
        {
            int remainder=target-n;
            if(cansumrecursion(remainder,nums))
            {
                return true;
            }
        }
        return false;
    }
    private boolean cansumDynamic(int target,int[] nums)
    {
        if(hashMap.containsKey(target))
        {
            return hashMap.get(target);
        }
        if(target==0)
        {
            return true;
        }
        if(target<0)
        {
            return false;
        }
        for(int n:nums)
        {
            int reminder=target-n;
            if(cansumDynamic(reminder,nums))
            {
                hashMap.put(reminder,cansumDynamic(reminder,nums));
                return true;
            }

        }
        return false;
    }
}
