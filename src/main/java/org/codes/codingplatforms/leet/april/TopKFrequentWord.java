package org.codes.codingplatforms.leet.april;

import java.util.*;

public class TopKFrequentWord {
    public static void main(String[] args) {
        String s[]=new String[]{"i","love","leetcode","i","love","coding"};
        TopKFrequentWord t=new TopKFrequentWord();
        t.topKFrequent(s,2).stream().forEach(System.out::println);

    }
    public List<String> topKFrequent(String[] words, int k) {
        Comparator<Map.Entry<String,Integer>> comparator=new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue()-o1.getValue()>0)
                {
                    return 1;
                } else if (o2.getValue()-o1.getValue()==0) {
                    return o1.getValue().compareTo(o2.getValue())-1;
                }
                else return 0;
            }
        };
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(comparator);
        Map<String,Integer> map=new HashMap<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            pq.offer(entry);
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            list.add(pq.poll().getKey());
        }
        return list;
    }
}
