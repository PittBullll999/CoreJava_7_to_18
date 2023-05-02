package org.codes.codingplatforms.leet.april;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearing25percent_1287 {
    public static void main(String[] args) {
        ElementAppearing25percent_1287 e=new ElementAppearing25percent_1287();
        e.findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10});


    }
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int t=arr.length;

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>t/4)
            {
                return entry.getKey();
            }
        }
        return 0;
    }

}
