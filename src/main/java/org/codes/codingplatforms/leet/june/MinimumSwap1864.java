package org.codes.codingplatforms.leet.june;

import java.util.stream.Stream;

public class MinimumSwap1864 {
    public static void main(String[] args) {
        String s="111000";
        MinimumSwap1864 m=new MinimumSwap1864();
        System.out.println(m.minSwaps(s));
    }
    public int minSwaps(String s) {
        String s1=createAlternateString(s.length(),"1");
        String s2=createAlternateString(s.length(),"0");
        int k=checkDiff(s,s1);
        int p=checkDiff(s,s2);
        return k>p?p:k;

    }
    private int checkDiff(String orgString,String newString)
    {
        int count=0;
        for(int i=0;i<orgString.length();i++)
        {
            if(orgString.charAt(i)!=newString.charAt(i))
            {
                count+=1;
            }
        }
        return count;
    }
    private String createAlternateString(int n,String start)
    {
        String s="";
        if(start.equals("1"))
        {
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    s+="1";
                }
                else {
                    s+="0";
                }
            }
        }
        else {
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    s+="0";
                }
                else {
                    s+="1";
                }
            }
        }
        return s;
    }

}
