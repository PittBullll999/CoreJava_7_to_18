package org.codes.codingplatforms.leet.may;

import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        //
        char[] c=new char[]{'a','a','b','b','c','c','c'};
        StringCompression s=new StringCompression();
        s.compress(c);
    }
    public int compress(char[] chars) {
        int cpos=0;
        int ipos=1;
        String s="";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++)
        {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
            if(map.size()>1)
            {
                int val=map.get(chars[i-1]);
                if(val==1)
                {
                    s+=chars[i-1];
                }
                else {
                    s+=(chars[i-1]+String.valueOf(val));
                }
                map.remove(chars[i-1]);
            }
        }
        char c=chars[chars.length-1];
        int val=map.get(c);
        if(val==1)
        {
            s+=c;

        }
        else {
            s+=(c+String.valueOf(val));

        }
        for(int i=0;i<s.length();i++)
        {
            chars[i]=s.charAt(i);
        }

        return s.length();

    }
}
