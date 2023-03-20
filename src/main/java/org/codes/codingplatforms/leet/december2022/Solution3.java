package org.codes.codingplatforms.leet.december2022;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public static void main(String[] args) {
        String s="abbcccaa";
        countHomogenous(s);

    }
    public static int countHomogenous(String s) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put(s.substring(0,1),1);
        int start=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                if(hashMap.get(s.substring(i,i+1))==null)
                {
                    hashMap.put(s.substring(i,i+1),1);
                }
                else {
                    hashMap.put(s.substring(i,i+1),hashMap.get(s.substring(i,i+1))+1);
                }

                if(hashMap.get(s.substring(start,i+1))==null)
                {
                    hashMap.put(s.substring(start,i+1),1);
                }
                else {
                    hashMap.put(s.substring(start,i+1),hashMap.get(s.substring(start,i+1)));
                }
            }
            else
            {
                start=i;
                if(hashMap.get(s.substring(i,i+1))==null)
                {
                    hashMap.put(s.substring(i,i+1),1);
                }
                else {
                    hashMap.put(s.substring(i,i+1),hashMap.get(s.substring(i,i+1))+1);
                }

            }
        }
        int su=0;
        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
        {
            su+=entry.getValue();
        }
        System.out.println(hashMap.toString());
        System.out.println(su);
        return su;

    }
}