package org.codes.codingplatforms.leet.february;

import java.util.*;

public class TopKFrequentWord {
    public static void main(String[] args) {
        String[] array=new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        TopKFrequentWord t=new TopKFrequentWord();
        t.topKFrequent(array,4);
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        SortedSet<String> list=new TreeSet<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>=k)
            {
                list.add(entry.getKey());
            }
        }
        return list.stream().toList();
    }
}
