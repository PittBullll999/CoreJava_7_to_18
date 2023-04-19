package org.codes.codingplatforms.leet.april;

import javax.print.DocFlavor;
import java.util.*;

public class CommonCharectors {
    public static void main(String[] args) {
        String[] s=new String[]{"bella","label","roller"};
        CommonCharectors c=new CommonCharectors();
        c.commonChars(s);
    }


    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        int n=words.length;
        for(String s:words)
        {
            Set<Character> set=new HashSet<>();
            for(char c:s.toCharArray())
            {
                set.add(c);
            }
            for(Character ss:set)
            {
                map.put(ss,map.getOrDefault(ss,0)+1);
            }
        }
        System.out.println(map);
        List<String> list=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==n)
            {
                list.add(entry.getKey().toString());
            }
        }
        System.out.println(list);
        return list;
    }
}
