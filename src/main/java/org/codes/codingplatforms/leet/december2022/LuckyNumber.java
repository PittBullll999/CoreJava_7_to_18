package org.codes.codingplatforms.leet.december2022;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LuckyNumber {
    public int findLucky(int[] arr) {
        int t[]=new int[100];

        SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i:arr)
        {
            sortedMap.put(i,sortedMap.getOrDefault(i,0)+1);
        }
        int p=-1;
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet())
        {
            if(entry.getValue()==entry.getKey())
            {
                p=entry.getKey();
            }
        }
        return p;

    }
}
