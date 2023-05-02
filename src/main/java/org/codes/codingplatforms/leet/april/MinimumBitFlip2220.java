package org.codes.codingplatforms.leet.april;

import javax.swing.plaf.IconUIResource;

public class MinimumBitFlip2220 {
    public static void main(String[] args) {
        MinimumBitFlip2220 m=new MinimumBitFlip2220();
        m.minBitFlips(10,7);
    }
    public int minBitFlips(int start, int goal) {
            String n1=convertBinary(start);
            String n2=convertBinary(goal);
            int count=0;
            for(int i=0;i<32;i++)
            {
                if(n1.charAt(i)!=n2.charAt(i))
                {
                    count+=1;
                }
            }
            return count;
    }
    private String convertBinary(int n)
    {
        String s="";
        while (n>0)
        {
            int rem=n%2;
            s=Integer.toString(rem)+s;
            n/=2;
        }
        String p="";
        for(int i=0;i<32-s.length();i++)
        {
            p+='0';
        }

        return p+s;
    }
}
