package org.codes.codingplatforms.leet.april;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicate_3 {
    public static void main(String[] args) {
        String s="abba";
        LongestSubstringWithoutDuplicate_3 l=new LongestSubstringWithoutDuplicate_3();
        l.lengthOfLongestSubstring(s);
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int firstPos=0;
        int lastPos=1;
        int currPos=0;
        Map<Character,Integer> map=new HashMap<>();
        int count=1;
        map.put(s.charAt(0),0);
        int length=s.length();
        int maxCount=1;

        while(lastPos<length)
        {
            if(map.containsKey(s.charAt(lastPos)))
            {
                int pos=map.get(s.charAt(lastPos));
                if(firstPos<=pos) {
                    firstPos = pos + 1;
                }

                map.put(s.charAt(lastPos),lastPos);
                lastPos+=1;
                count=lastPos-firstPos;
            }
            else {
                map.put(s.charAt(lastPos),lastPos);
                count+=1;
                lastPos+=1;
            }
            if(count>maxCount)
            {
                maxCount=count;
            }
        }
        return maxCount;
    }
}
