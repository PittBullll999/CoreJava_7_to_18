package org.codes.codingplatforms.leet.december2022;

import javax.swing.*;
import java.util.*;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int n=(int)Math.floor(nums.length/3);
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i:nums)
        {
            if(hashMap.containsKey(i))
            {
                hashMap.put(i,hashMap.get(i)+1);
            }
            else {
                hashMap.put(i,1);
            }

        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()>n)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
