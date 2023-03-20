package org.codes.codingplatforms.leet.december2022;

import java.util.HashSet;

public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums)
        {
            if(hashSet.contains(i))
            {
                return i;
            }
            hashSet.add(i);
        }
        return(-1);

    }
}
