package org.codes.codingtechnique.dynamicprogramming.leet;

import java.util.HashMap;

public class Fib {
    HashMap<Integer,Integer> hashMap=new HashMap<>();
    public static void main(String[] args) {
        Fib f=new Fib();
        System.out.println(f.fib(6));
    }


    public int fib(int n) {


        if(hashMap.containsKey(n))
        {
            return hashMap.get(n);
        }
        if(n<=1)
        {
            hashMap.put(n,n);
            return n;
        }
        else {
            hashMap.put(n,fib(n-1)+fib(n-2));
            return hashMap.get(n);
        }

    }
}
