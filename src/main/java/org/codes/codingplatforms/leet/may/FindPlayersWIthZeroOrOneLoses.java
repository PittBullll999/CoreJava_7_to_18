package org.codes.codingplatforms.leet.may;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWIthZeroOrOneLoses {
    public static void main(String[] args) {

        FindPlayersWIthZeroOrOneLoses f=new FindPlayersWIthZeroOrOneLoses();
        f.findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}});
    }
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
            int[] t=matches[i];
            map.put(t[1],map.getOrDefault(t[1],0)+1);
            if(!map.containsKey(t[0]))
            {
                map.put(t[0],0);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                list2.add(entry.getKey());
            }
            if(entry.getValue()==0)
            {
                list1.add(entry.getKey());
            }
        }
        list1.stream().sorted();
        list2.stream().sorted();
        return List.of(list1,list2);



    }
}
