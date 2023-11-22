package org.codes.codingplatforms.gfg.Month8;

public class NthFibNo {
    public static void main(String[] args) {
        NthFibNo.nthFibonacci(100000);
    }
    static int nthFibonacci(int n){
        // code here
        long curr[]=new long[n+1];
        curr[0]=0;
        curr[1]=1;
        for(int i=2;i<n+1;i++)
        {
            curr[i]=(curr[i-1]+curr[i-2])%1000000007;

        }
        //Arrays.stream(curr).forEach(System.out::println);
        return (int)curr[n];
    }
}
