package org.codes.codingplatforms.gfg.Month8;

import java.util.HashMap;

public class LongestKUniqueCharecterString {
    public static void main(String[] args) {
        LongestKUniqueCharecterString l=new LongestKUniqueCharecterString();
        l.longestkSubstr("rciyzfvnx",4);
    }
    public int longestkSubstr(String s, int k) {
        int leftPointer=0;
        int rightPointer=0;
        int totalMax=-1;
        int currentMax=0;
        int length=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        while (rightPointer!=length)
        {
            if(map.size()==k)
            {
                if(totalMax<currentMax)
                {
                    totalMax=currentMax;
                }
            }
            if(map.size()<=k)
            {
                char ch=s.charAt(rightPointer);
                map.put(ch,map.getOrDefault(ch,0)+1);
                rightPointer+=1;
                currentMax+=1;
            }
            if(rightPointer==length)
            {
                return totalMax;
            }
            if(map.size()>k)
            {
                char ch=s.charAt(leftPointer);
                if(map.get(ch)==1)
                {
                    map.remove(ch);
                    currentMax-=1;
                }
                else {
                    map.put(ch,map.get(ch)-1);
                    currentMax-=1;
                }
                leftPointer+=1;
            }
        }
        return totalMax;
    }
}
