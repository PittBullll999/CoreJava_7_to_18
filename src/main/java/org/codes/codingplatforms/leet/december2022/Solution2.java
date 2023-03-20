package org.codes.codingplatforms.leet.december2022;

class Solution2 {
    public static void main(String[] args) {
        String s="leeeeetcoooode";
        System.out.println(maxPower(s));

    }
    public static int maxPower(String s) {

        int m=1;

        int t=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                t=t+1;
            }
            else
            {
                t=1;
            }
            if(t>m)
            {
                m=t;
            }
        }
        return m;

    }
}