package org.codes.codingplatforms.leet.december2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckOccurance {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int common=0;
        for(char c:s.toCharArray())
        {
            if(hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);
                common=hashMap.get(c);
            }
            else {
                hashMap.put(c,1);
            }
        }
        HashSet<Integer> t=new HashSet<>();
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet())
        {
            t.add(entry.getValue());
        }
        return (t.size()!=1);
    }
}
