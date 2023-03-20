package org.codes.codingplatforms.leet.december2022;

import java.util.HashMap;
import java.util.Map;

public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        System.out.println(checkDistances("aa",new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));

    }
    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hashMap.containsKey(c))
            {
                //hashMap.put(c,i-hashMap.get(c)-1);
                int p=(int) c-97;
                if(distance[p]!=i-hashMap.get(c)-1)
                {
                    return false;
                }
            }
            else {
                hashMap.put(c,i);
            }
        }
//        for(Map.Entry<Character,Integer> entry:hashMap.entrySet())
//        {
//            char t=entry.getKey();
//            int p=(int) t-97;
//            if(distance[p]!=entry.getValue())
//            {
//                return false;
//            }
//        }
//        System.out.println(hashMap.toString());
        return true;

    }
}
