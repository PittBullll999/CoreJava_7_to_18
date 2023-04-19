package org.codes.codingplatforms.leet.april;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int t[]=new int[]{1,1,1,2,2,3};
        TopKFrequentElement tp=new TopKFrequentElement();
        tp.topKFrequent(t,2);

    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int t[]=new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((x,y)->y.getValue()-x.getValue());
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            pq.offer(entry);
        }
        for(int i=0;i<k;i++)
        {
            t[i]=pq.poll().getKey();
        }
        return t;

    }
}
