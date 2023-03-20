package org.codes.codingplatforms.leet.december2022;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args) {
        String s="asdfghjklpoiuytr";
        String t="asdfghjklpoiuytrs";
        System.out.println(findTheDifference(s,t));

    }
    public static   char findTheDifference(String s, String t) {
            HashMap<Character,Integer> hashMap1=new HashMap<>();

            char r ;
            if(s.length()==0)
            {
                return t.charAt(0);
            }
            else {
                for(int i=0;i<s.length();i++)
                {
                    if(hashMap1.containsKey(s.charAt(i)))
                    {
                        hashMap1.put(s.charAt(i),hashMap1.get(s.charAt(i))+1);
                    }
                    else {
                        hashMap1.put(s.charAt(i),1);
                    }
                }
                for(int i=0;i<t.length();i++)
                {
                    if(!hashMap1.containsKey(t.charAt(i)))
                    {
                        return(t.charAt(i));
                    }
                    else {
                        if(hashMap1.get(t.charAt(i))==1)
                        {
                            hashMap1.remove(t.charAt(i));
                        }
                        else
                        {
                            hashMap1.put(t.charAt(i),hashMap1.get(t.charAt(i))-1);
                        }
                    }
                }
                for(Map.Entry<Character,Integer> entry:hashMap1.entrySet())
                {
                    return entry.getKey();
                }

            }
            return 'a';

        }
    }

