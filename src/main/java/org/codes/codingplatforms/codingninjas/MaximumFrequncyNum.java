package org.codes.codingplatforms.codingninjas;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MaximumFrequncyNum {
    public static void main(String[] args) {
        int a[]=new int[]{0 ,-5 ,-2 ,-4 ,2 ,-2 ,-3 ,-1 ,-1 ,-3 };
        System.out.println(maxFrequencyNumber(5,a));
    }
    public static int maxFrequencyNumber(int n, int[] arr) {
        SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            if(sortedMap.containsKey(arr[i]))
            {
                sortedMap.put(arr[i],sortedMap.get(arr[i])+1);
            }
            else {
                sortedMap.put(arr[i],1);
            }
        }

        int key=0;
        int value=0;
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>value)
            {

                value=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }
}
