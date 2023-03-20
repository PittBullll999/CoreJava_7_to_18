package org.codes.codingplatforms.leet.february;




import java.util.SortedMap;
import java.util.TreeMap;


public class LongestHarmoniusSubarray {
    public static void main(String[] args) {
        LongestHarmoniusSubarray l=new LongestHarmoniusSubarray();
        l.findLHS(new int[]{1,3,2,2,5,2,3,7});
    }
    public int findLHS(int[] nums) {
        SortedMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.size()<=0)
        {
            return 0;
        }
        int max=0;
        int prevKey=map.firstKey();
        int prevValue=map.remove(map.firstKey());

        while(map.size()>0)
        {
            int currKey=map.firstKey();
            int currValue=map.remove(currKey);
            if(max<currValue+prevValue&&(currKey-prevKey)==1)
            {
                max=currValue+prevValue;
            }
            prevKey=currKey;
            prevValue=currValue;

        }
        System.out.println(max);
        return max;


    }
}
