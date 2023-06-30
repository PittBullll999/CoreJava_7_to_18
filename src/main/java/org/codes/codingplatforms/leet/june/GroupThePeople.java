package org.codes.codingplatforms.leet.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {
    public static void main(String[] args) {
        int t[]=new int[]{3,3,3,3,3,1,3};
        GroupThePeople g=new GroupThePeople();
        g.groupThePeople(t);
    }
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map =new HashMap<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            if(map.containsKey(groupSizes[i]))
            {
                map.get(groupSizes[i]).add(i);

            }
            else {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list );
            }
        }
        List<List<Integer>> returnList=new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            returnList.addAll(splitList(entry.getValue(),entry.getKey()));
        }

        return returnList;
    }
    public List<List<Integer>> splitList(List<Integer> list,int n)
    {
        int count=0;
        List<List<Integer>> returnList=new ArrayList<>();
        for(int i=0;i<list.size()/n;i++)
        {
            List<Integer> integerList=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                integerList.add(list.get(count));
                count+=1;
            }
            returnList.add(integerList);
        }
        return returnList;
    }
}
