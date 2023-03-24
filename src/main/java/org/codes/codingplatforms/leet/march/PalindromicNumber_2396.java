package org.codes.codingplatforms.leet.march;

public class PalindromicNumber_2396 {
    public static void main(String[] args) {
        PalindromicNumber_2396 p=new PalindromicNumber_2396();
        p.isStrictlyPalindromic(8);
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++)
        {
            String s=makeBase(n,i);
            StringBuilder p=new StringBuilder(s);
            p.reverse();
            if(p.toString()!=s.toString())
            {
                return false;
            }
        }
        return true;

    }
    private String makeBase(int n,int b)
    {
        String s="";
        while(n>0)
        {
            int rem=n%b;
            s=Integer.toString(rem)+s;
            n=n/b;
        }
        return s;
    }

}
