package org.codes.codingplatforms.leet.january2023;

import java.util.SortedMap;
import java.util.TreeMap;

public class MinimumRounds {
    public static void main(String[] args) {
        int[] t=new int[]{2,3,3};

    }
    public  int minimumRounds(int[] tasks) {
        SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i:tasks)
        {
            sortedMap.put(i,sortedMap.getOrDefault(i,0)+1);
        }

        int count=0;
        while (sortedMap.size()>0)
        {
            int t=sortedMap.get(sortedMap.firstKey());
            if(t==1)
            {
                return -1;
            }
            if(t%3==1)
            {

                count+=1;
                continue;
            }
            if(t%3==0&&t-3!=0)
            {
                sortedMap.put(sortedMap.firstKey(),t-3);
                count+=1;
                continue;
            }
            else if(t%3==0&&t-3==0)
            {
                sortedMap.remove(sortedMap.firstKey());
                count+=1;
                continue;
            }
            if(t%3==2&&t-2!=0)
            {
                sortedMap.put(sortedMap.firstKey(),t-2);
                count+=1;
                continue;
            }
            if(t%3==2&&t-2==0)
            {
                sortedMap.remove(sortedMap.firstKey());
                count+=1;
                continue;
            }

        }
        return count;

    }
}
