package org.codes.codingtechnique.dynamicprogramming.memorization;

import java.util.HashMap;

public class Fibonacci {
    HashMap<Integer ,Integer> hashMap=new HashMap<>();
    int count=0;

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
//        for(int i=30;i>0;i--)
//        {
//            System.out.println(f.fibonacci(i));
//        }
        System.out.println(f.fibonacci(30));
        System.out.println(f.count);
        System.out.println(f.fibonacci(34));
        System.out.println(f.count);

    }
    public int fibonacci(int n)
    {
        if(n<=1)
        {

            hashMap.put(n,n);
        }
        if(hashMap.containsKey(n))
        {
            count+=1;
            return hashMap.get(n);

        }
        else {
            hashMap.put(n,fibonacci(n-1)+fibonacci(n-2));
            count+=1;
            return hashMap.get(n);
        }
    }
}
