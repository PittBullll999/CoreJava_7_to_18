package org.codes.codingplatforms.leet.december2022;

import java.util.*;

public class Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        frequencySort(new int[]{1,2,3,1,1,2,3,4,4,2});

    }
    public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {

        Comparator<K> valueComparator = new Comparator<K>()
        {

            public int compare(K k1, K k2)
            {

                int comp = map.get(k1).compareTo(map.get(k2));

                if (comp == 0)
                    return 1;

                else
                    return comp;
            }
        };


        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);

        sorted.putAll(map);

        return sorted;
    }
    public static int[] frequencySort(int[] nums) {
        TreeMap<Integer,Integer> sortedMap=new TreeMap<>();
        int maxfreq=0;
        for(int i:nums)
        {
            if(sortedMap.containsKey(i))
            {
                sortedMap.put(i,sortedMap.get(i)+1);
                if(sortedMap.get(i)>maxfreq)
                {
                    maxfreq=sortedMap.get(i);
                }
            }
            else {
                sortedMap.put(i,1);
            }
        }
        System.out.println(sortedMap.toString());
        sortedMap.containsValue(2);

        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet())
        {

        }




        return new int[]{12,3};
    }
}
