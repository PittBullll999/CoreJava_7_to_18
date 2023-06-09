package org.codes.codingplatforms.leet.june;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertArray2610 {
    public static void main(String[] args) {
        int t[]=new int[]{1,3,4,1,2,3,1};
        ConvertArray2610 c=new ConvertArray2610();
        c.findMatrix(t);
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> returnList=new ArrayList<>();
        List<Integer> list= Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>();
        boolean flag=true;
        int current=0;
        int total_size=0;
        int t=nums.length;
        while (total_size<t)
        {
            List<Integer> newList=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {

                if(!set.contains(nums[i])&&nums[i]>0)
                {
                    set.add(nums[i]);
                    newList.add(nums[i] );
                    nums[i]=-1;
                    total_size+=1;
                }
            }

            set.clear();
            returnList.add(newList);
        }
        return returnList;
    }
}
