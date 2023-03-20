package org.codes.codingplatforms.leet.january2023;

import java.util.HashSet;
import java.util.Set;

public class MinimumRecolors {
    public static void main(String[] args) {
        String s="WWWWBBWB";
        MinimumRecolors m=new MinimumRecolors();
        System.out.println(m.minimumRecolors(s,7));
        Set<Character> set=new HashSet<>();

    }
    public int minimumRecolors(String blocks, int k) {
        int b=0;
        int w=0;

        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='B')
            {
                b+=1;
            }
            else {
                w+=1;
            }
        }
        int minw=w;
        for(int i=1;i<blocks.length()-k+1;i++)
        {
            int t=i+k-1;
            String s=blocks.substring(i,k+i);
            if(blocks.charAt(i-1)=='W')
            {
                w-=1;
            }
            else {
                b-=1;
            }
            if(blocks.charAt(t)=='W')
            {
                w+=1;
            }
            else{
                b+=1;
            }
            if(minw>w)
            {
                minw=w;
            }

        }
        return minw;

    }
}
