package org.codes.codingtechnique.dynamicprogramming.leet;

import java.util.HashMap;

public class Tribonacci {
    HashMap<Integer,Integer> hashMap=new HashMap<>();
    public int tribonacci(int n) {
        if(hashMap.containsKey(n))
        {
            return hashMap.get(n);
        }
        if(n<=1)
        {
            hashMap.put(n,n);
            return n;
        }
        if(n==2)
        {
            hashMap.put(2,1);
            return hashMap.get(2);
        }
        else {
            hashMap.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
            return hashMap.get(n);
        }

    }
}
