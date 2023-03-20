package org.codes.codingtechnique.dynamicprogramming.tabulation;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        Arrays.stream(fibonacci(100)).forEach(System.out::println);

    }
    public static double[] fibonacci(int n)
    {
        double fib[]=new double[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;

    }
}
