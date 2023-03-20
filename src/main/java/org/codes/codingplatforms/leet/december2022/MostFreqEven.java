package org.codes.codingplatforms.leet.december2022;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MostFreqEven {
    public int mostFrequentEven(int[] nums) {

        SortedMap<Integer,Integer> hashMap=new TreeMap<>();

        Arrays.stream(nums).filter(i->i%2==0).forEach(
                i->{
                    if(hashMap.containsKey(i))
                    {
                        hashMap.put(i,hashMap.get(i)+1);
                    }
                    else {
                        hashMap.put(i,1);
                    }

                }
        );
        int t=-1;
        int k=0;
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()>k)
            {
                k=entry.getValue();
                t=entry.getKey();
            }

        }
        return t;

    }
}
