package org.codes.codingplatforms.leet.february;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        SortedSet<Integer> map=new TreeSet<>();
        for(int i:nums)
        {
            map.add(i);
        }
        if(map.size()<3)
        {
            return map.first();
        }
        map.remove(map.last());
        map.remove(map.last());
        return map.last();
    }
}
