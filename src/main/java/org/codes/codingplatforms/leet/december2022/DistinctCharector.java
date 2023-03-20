package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class DistinctCharector {
    public static void main(String[] args) {
        countGoodSubstrings("aaaiujofaijijanoijitaoingoignaokooniuahsiufhriuhahuahfjsdkfjasiofjsifsfsnfshnfiuhfua");

    }
    public static int countGoodSubstrings(String s) {
        if(s.length()<3)
        {
            return 0;
        }
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int i=0;
        int count=1;
        while (i<3)
        {
            if(hashMap.containsKey(s.charAt(i)))
            {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
                i+=1;
                count=0;

            }
            else{
                hashMap.put(s.charAt(i),1);
                i+=1;
            }
        }

        while (i<s.length())
        {
            Character t=s.charAt(i);
            Character m=s.charAt(i-3);
            if(hashMap.get(m)!=1)
            {
                hashMap.put(m,hashMap.get(m)-1);
            }
            else {
                hashMap.remove(m);
            }
            if(hashMap.containsKey(t))
            {
                hashMap.put(t,hashMap.get(t)+1);
            }
            else {
                hashMap.put(t,1);
            }
            if(hashMap.size()==3)
            {
                count+=1;
            }
            i+=1;


        }
        System.out.println(count);

        return count;

    }
}
