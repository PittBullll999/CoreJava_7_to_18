package org.codes.codingplatforms.leet.january2023;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a ="abcd";
        String b="cdabcdab";
        RepeatedStringMatch r=new RepeatedStringMatch();
        System.out.println(r.repeatedStringMatch(a,b));
    }
    public int repeatedStringMatch(String a, String b) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character ,Integer> map2=new HashMap<>();
        for(char c:a.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:b.toCharArray())
        {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        int max=0;
        for(Map.Entry<Character,Integer> entry:map2.entrySet())
        {
            if(!map1.containsKey(entry.getKey()))
            {
                return -1;
            }
            if(entry.getValue()>max)
            {
                max=entry.getValue();
            }
        }
        b.charAt(0);
        if(a.charAt(0)!=b.charAt(0))
        {
            return max+1;
        }

        return max;

    }
}
