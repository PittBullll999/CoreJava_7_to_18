package org.codes.codingplatforms.gfg.Month8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NonRepatingNumbers {
    public int[] singleNumber(int[] nums)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }
        int t[]=new int[set.size()];
        List<Integer> list=set.stream().sorted().collect(Collectors.toList());
        for(int i=0;i<t.length;i++)
        {
            t[i]=list.get(i);
        }
        return t;
    }

}
