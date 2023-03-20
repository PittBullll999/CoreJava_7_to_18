package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class MajorirtyElement3 {
    public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int t=(int) n/k;
        ArrayList<Integer> list=new ArrayList<>();
        SortedSet<Integer> sortedSet=new TreeSet<>();
        arr.stream().forEach(
                i->{
                    if(hashMap.containsKey(i))
                    {
                        hashMap.put(i,hashMap.get(i)+1);

                    }
                    else{
                        hashMap.put(i,1);
                    }
                    if(hashMap.get(i)>=t)
                    {
                        sortedSet.add(i);
                    }

                }
        );
        sortedSet.stream().forEach(i->list.add(i));
        return list;
    }
}
