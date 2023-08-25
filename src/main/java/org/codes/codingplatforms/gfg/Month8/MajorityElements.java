package org.codes.codingplatforms.gfg.Month8;

import java.util.HashMap;

public class MajorityElements {
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])>a.length/2)
            {
                return a[i];
            }
        }

        // your code here
        return 0;
    }
}
