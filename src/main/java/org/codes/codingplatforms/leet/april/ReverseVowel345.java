package org.codes.codingplatforms.leet.april;

import java.util.SortedMap;
import java.util.TreeMap;

public class ReverseVowel345{
    public static void main(String[] args) {
        ReverseVowel345 r=new ReverseVowel345();
        r.reverseVowels("leetcode");
    }
    public String reverseVowels(String s) {
        SortedMap<Integer,Character> map=new TreeMap<>();
        char t[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                map.put(i,c);
            }
        }
        int p=map.size()/2;
        for(int i=0;i<p;i++)
        {
            int f=map.firstKey();
            char cf=map.get(f);
            int l=map.lastKey();
            char cl=map.get(l);
            t[f]=cl;
            t[l]=cf;
            map.remove(f);
            map.remove(l);
        }
        return String.valueOf(t);

    }
}
