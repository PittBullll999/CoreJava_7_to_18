package org.codes.codingplatforms.leet.december2022;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class CoutCommonWords {
    public static void main(String[] args) {
        String[] s=new String[]{"leetcode","is","amazing","as","is"};
        String s2[]=new String[]{"amazing","leetcode","is"};
        countWords(s,s2);


    }
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hashMap1=new HashMap<>();
        HashMap<String,Integer> hashMap2=new HashMap<>();

        for(int i=0;i<words1.length;i++)
        {
            if(hashMap1.containsKey(words1[i]))
            {
                hashMap1.put(words1[i],hashMap1.get(words1[i])+1);
            }
            else {
                hashMap1.put(words1[i],1 );
            }
        }
        for(int i=0;i<words2.length;i++)
        {
            if(hashMap2.containsKey(words2[i]))
            {
                hashMap2.put(words2[i],hashMap1.get(words2[i])+1);
            }
            else
            {
                hashMap2.put(words2[i],1 );
            }
        }
        int num=0;
        for(Map.Entry<String,Integer> element:hashMap1.entrySet())
        {
            if((element.getValue()==1) && hashMap2.containsKey(element.getKey()))
            {
                if(hashMap2.get(element.getKey())==1)
                {
                    num+=1;
                }

            }
        }
        System.out.println(num);
        return num;
    }
}
