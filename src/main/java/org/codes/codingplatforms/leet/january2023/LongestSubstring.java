package org.codes.codingplatforms.leet.january2023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        LongestSubstring l=new LongestSubstring();
        System.out.println(l.lengthOfLongestSubstring("bbbbbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int right=1;
        int left=0;

        int count=1;
        int m=1;
        hashMap.put(s.charAt(0),0);
        while(right<s.length())
        {
            if(hashMap.containsKey(s.charAt(right)))
            {
                hashMap.clear();
                hashMap.put(s.charAt(right),right);
                left=right;
                right+=1;

                if(m>=count)
                {
                    count=m;
                    m=0;
                }
                m+=1;
            }
            else {
                hashMap.put(s.charAt(right),right);
                m+=1;
                right+=1;

            }

        }
        if(m>count)
        {
            return m;
        }
        return count;


    }
}
