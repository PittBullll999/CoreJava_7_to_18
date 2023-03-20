package org.codes.codingplatforms.leet.february;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class N_RepatedElement {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums)
        {
            if(hashSet.contains(i))
            {
                return i;
            }
            hashSet.add(i);
        }
        return -1;
    }
}
