package org.codes.codingplatforms.leet.may;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharByFrequency {
    public static void main(String[] args) {
        SortCharByFrequency s=new SortCharByFrequency();
        s.frequencySort("aabbb");
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((x,y)->map.get(y)-map.get(x));
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            pq.offer(entry.getKey());
        }
        String st="";
        while (!pq.isEmpty())
        {
            Character p=pq.poll();
            int t=map.get(p);
            st+=makeString(p,t);
        }
        return st;




    }

    private String makeString(Character p, int t) {
        String s="";
        for(int i=0;i<t;i++)
        {
            s+=p;
        }
        return s;
    }


}
