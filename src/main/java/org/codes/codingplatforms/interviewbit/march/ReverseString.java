package org.codes.codingplatforms.interviewbit.march;

public class ReverseString {
    public static void main(String[] args) {
        String s="this is abhinav";
        ReverseString r=new ReverseString();
        System.out.println(r.solve(s));
    }
    public String solve(String A) {
        String[] a=A.split(" ");
        int n=a.length;
        for(int i=0;i<n/2;i++)
        {
            String k=a[i];

            a[i]=a[n-i-1];
            a[n-i-1]=k;
        }
        String s="";
        for(int i=0;i<n;i++)
        {
            s+=a[i]+" ";
        }
        return s.trim();
    }
}
