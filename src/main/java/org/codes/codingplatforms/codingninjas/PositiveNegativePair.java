package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PositiveNegativePair {
    public static ArrayList<ArrayList<Integer>> pairs(ArrayList<Integer> arr, int n) {
        // Write your code here.
        HashMap<Integer,Integer> hashSet=new HashMap<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i:arr)
        {
            hashSet.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry:hashSet.entrySet())
        {
            if(entry.getValue()==1
                    && hashSet.containsKey(0-entry.getKey())
                    && hashSet.get(0-entry.getKey())==1
                    && entry.getKey()!=0)
            {
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(entry.getKey());
                list1.add(0-entry.getKey());
                list.add(list1);
                hashSet.put(entry.getKey(),0);
                hashSet.put(0-entry.getKey(),0);
            }
        }
        return list;
    }

}
