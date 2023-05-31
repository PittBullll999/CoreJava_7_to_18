package org.codes.codingplatforms.leet.may;

import org.codes.codingplatforms.leet.april.MergeStringAlternatievely;

import java.util.HashMap;
import java.util.Map;

public class ReconstructOriginalDigit {
    public static void main(String[] args) {
        ReconstructOriginalDigit r=new ReconstructOriginalDigit();
        r.originalDigits("owoztneoer");
    }
    public String originalDigits(String s) {
        String str[]=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};

        Map<Character,Integer>
                 map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String f="";
        for(int i=0;i<10;i++)
        {
            String t=str[i];
            if(findAvailablele(t,map))
            {
                f+=Integer.toString(i);
            }
        }
        return f;


    }

    private boolean findAvailablele(String s, Map<Character, Integer> map) {
        for(char c:s.toCharArray())
        {
            if(!map.containsKey(c))
            {
                return false;
            }

        }
        for(char c:s.toCharArray())
        {
            int t=map.get(c);
            if(t==1)
            {
                map.remove(c);
            }else {
                map.put(c,t-1);
            }
        }
        return true;
    }
}
