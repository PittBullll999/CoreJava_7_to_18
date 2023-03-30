package org.codes.codingplatforms.leet.march;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class SortedSqureArray {
    public static void main(String[] args) {
        SortedSqureArray s=new SortedSqureArray();
        s.sortedSquares(new int[]{-7,-3,2,3,11});
    }
    public int[] sortedSquares(int[] nums) {
        SortedMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums)
        {
            map.put(i*i,map.getOrDefault(i*i,0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int n=entry.getValue();
            if(n==1)
            {
                nums[i]=entry.getKey();
                i+=1;
            }
            else {
                for(int j=0;j<n;j++)
                {
                    nums[i+j]=entry.getKey();

                }
                i+=n;
            }
        }
        return nums;

    }
}
