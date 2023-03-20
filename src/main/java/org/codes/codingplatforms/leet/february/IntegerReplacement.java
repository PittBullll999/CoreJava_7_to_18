package org.codes.codingplatforms.leet.february;

import java.util.HashMap;
import java.util.Map;

public class IntegerReplacement {
    public static void main(String[] args) {
        IntegerReplacement i=new IntegerReplacement();
        i.integerReplacement(7);
    }
    Map<Integer,Integer> map=new HashMap<>();
    public int integerReplacement(int n) {
        int i=replace(n);
        System.out.println(i);
        return i;



    }
    private int replace(int n)
    {
        //System.out.println(n);
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        if(n<=1)
        {
            return 0;
        }
        if(n%2==0)
        {
            map.put(n/2,1+replace(n/2));
            return map.get(n/2);
        }else {
            map.put(n+1,1+replace(n+1));
            map.put(n-1,1+replace(n-1));
            return Math.min(map.get(n+1),map.get(n-1));
        }

    }
}
