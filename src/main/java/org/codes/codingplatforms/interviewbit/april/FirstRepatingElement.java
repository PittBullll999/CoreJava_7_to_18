package org.codes.codingplatforms.interviewbit.april;

import java.util.*;

public class FirstRepatingElement {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            if(map.containsKey(A.get(i)))
            {
                List<Integer> list=map.get(A.get(i));
                list.add(i);
            }
            else {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(A.get(i),list);
            }
        }
        for(int i=0;i<A.size();i++)
        {
            int t=A.get(i);
            if(map.containsKey(t))
            {
                if(map.get(t).size()>1)
                {
                    return t;
                }
            }
        }
        return -1;
    }
}
