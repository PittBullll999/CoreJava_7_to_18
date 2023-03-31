package org.codes.codingplatforms.leet.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLosers2225 {
    public static void main(String[] args) {
        int t[][]=new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        FindLosers2225 f=new FindLosers2225();
        f.findWinners(t);

    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            int winner=matches[i][0];
            int loser=matches[i][1];
            if(!map.containsKey(winner))
            {
                map.put(winner,0);
            }
            map.put(loser,map.getOrDefault(loser,0)+1);
        }
        List<List<Integer>> newlist=new ArrayList<>();
        newlist.add(new ArrayList<>());
        newlist.add(new ArrayList<>());
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==0)
            {
                newlist.get(0).add(entry.getKey());
            }
            if(entry.getValue()==1)
            {
                newlist.get(1).add(entry.getKey());
            }
        }
        System.out.println(newlist);
        return newlist;



    }
}
