package org.codes.codingplatforms.codingninjas;

import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class UncommonCharectors {
    public static String findUncommonCharacters(String s1, String s2) {
        SortedSet<Character> sortedSet=new TreeSet<>();
        HashSet<Character> h1=new HashSet<>();
        HashSet<Character> h2=new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            h1.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++)
        {
            h2.add(s2.charAt(i));
        }
        for(Character i:h1)
        {
            if(!h2.contains(i))
            {
                sortedSet.add(i);
            }
        }
        for(Character i:h2)
        {
            if(!h1.contains(i))
            {
                sortedSet.add(i);
            }
        }
        String s="";
        for(Character i:sortedSet)
        {
            s+=i;
        }
        return s;
    }
}
