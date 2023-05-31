package org.codes.codingplatforms.leet.may;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWords {
    public static void main(String[] args) {
        String s[]=new String[]{"leetcode","is","amazing","as","is"};
        String s2[]=new String[]{"amazing","leetcode","is"};
        CountCommonWords c=new CountCommonWords();
        c.countWords(s2,s);
    }
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hashMap1=new HashMap<>();
        HashMap<String,Integer> hashMap2=new HashMap<>();

        for(String w:words1)
        {
            hashMap1.put(w,hashMap1.getOrDefault(w,0)+1);
        }
        for(String w:words2)
        {
            hashMap2.put(w,hashMap2.getOrDefault(w,0)+1);
        }
        int count=0;
        for (Map.Entry<String,Integer> entry:hashMap1.entrySet())
        {
            if(entry.getValue()==1)
            {
                if(hashMap2.containsKey(entry.getKey()))
                {
                    if(hashMap2.get(entry.getKey())==1)
                    {
                        count+=1;
                    }
                }
            }
        }
        return count;


    }
}
