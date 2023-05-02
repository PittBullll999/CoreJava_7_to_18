package org.codes.codingplatforms.leet.april;

public class NoZeroSum {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++)
        {
            if(containsZero(i)&&containsZero(n-i))
            {
                return new int[]{i,n-i};
            }
        }
        return new int[]{0,0};

    }
    private boolean containsZero(int n)
    {
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                return false;
            }

        }
        return true;
    }
}
