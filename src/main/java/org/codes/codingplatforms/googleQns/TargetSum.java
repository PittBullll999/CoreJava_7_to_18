package org.codes.codingplatforms.googleQns;

import reactor.util.function.Tuple2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        int t[]=new int[]{3,9,5,7,2,8,4,10};
        TargetSum tp=new TargetSum();
        tp.getIndeces(t,12).stream().forEach(System.out::println);

    }
    private List<List<Integer>> getIndeces(int[] a,int targetSum)
    {
        List<List<Integer>> newlist=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(targetSum-a[i]))
            {
                List<Integer> list=new ArrayList<>();
                list.add(map.get(targetSum-a[i]));
                list.add(i);

                newlist.add(list);
            }
            map.put(a[i],i);

        }
        return newlist;

    }
}

