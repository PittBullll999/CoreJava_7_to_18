package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class K_FrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
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
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()>=k)
            {
                list.add(entry.getKey());
            }
        }
        int[] t=new int[list.size()] ;
        AtomicInteger j= new AtomicInteger();
        list.stream().forEach(i-> {

            t[j.get()]=i;
            j.addAndGet(1);
        });
        return t;

    }
}
