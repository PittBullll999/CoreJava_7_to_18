package org.codes.codingplatforms.interviewbit.march;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorirtyElement {
    public int majorityElement(final int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max&&entry.getValue()>Math.floor(A.length))
            {
                max=entry.getValue();
            }
        }
        return max;
    }
    public int majorityElement1(final int[] A) {
        int t[]=new int[Arrays.stream(A).max().getAsInt()+1];
        int max=0;
        for(int i=0;i<A.length;i++)
        {
            t[A[i]]+=1;
            if(t[A[i]]>max&&t[A[i]]>Math.floor(A.length/2))
            {
                max=t[A[i]];
            }
        }
        return max;
    }
}
