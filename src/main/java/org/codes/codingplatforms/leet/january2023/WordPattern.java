package org.codes.codingplatforms.leet.january2023;

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String s="abba";
        String p="dog cat cat dog";
        System.out.println(wordPattern(s,p));
    }
    public static   boolean wordPattern(String pattern, String s) {
        SortedMap<Character,List<Integer>> sortedMapChar=new TreeMap<>();
        SortedMap<String,List<Integer>> sortedMapString=new TreeMap<>();
        char[] c=pattern.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(sortedMapChar.containsKey(c[i]))
            {
                List<Integer> list=sortedMapChar.get(c[i]);
                list.add(Integer.valueOf(i));
                sortedMapChar.put(c[i],list);
            }
            else
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                sortedMapChar.put(c[i],list);
            }
        }
        String[] strings=s.split(" ");
        for(int i=0;i<strings.length;i++)
        {
            if(sortedMapString.containsKey(strings[i]))
            {
                List<Integer> list=sortedMapString.get(strings[i]);
                list.add(Integer.valueOf(i));
                sortedMapString.put(strings[i],list);
            }
            else {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                sortedMapString.put(strings[i],list);
            }
        }

        if(sortedMapChar.size()!=sortedMapString.size())
        {
            return false;
        }

        HashSet<List<Integer>> hashSet=new HashSet<>();

        for(Map.Entry<Character,List<Integer>> entry:sortedMapChar.entrySet())
        {
            hashSet.add(entry.getValue());
        }
        int t=hashSet.size();
        for(Map.Entry<String,List<Integer>> entry:sortedMapString.entrySet())
        {
            hashSet.add(entry.getValue());
        }
        return (t==hashSet.size());






    }
}
