package org.codes.codingplatforms.gfg.Month8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class FindDuplicates {
    public static void main(String[] args) {
        FindDuplicates.duplicates(new int[]{2,3,1,1,2,3},5);
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                sortedMap.put(map.get(arr[i]),arr[i]);
            }
            else {
                map.put(arr[i],i );
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        if(sortedMap.size()==0)
        {
            list.add(-1);
            return list;
        }
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;
    }
}
