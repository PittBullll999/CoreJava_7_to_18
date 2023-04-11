package org.codes.codingplatforms.leet.april;

import java.util.SortedMap;
import java.util.TreeMap;

public class RelativeRanks506 {
    public static void main(String[] args) {
        int t[]=new int[]{5,1,3};
        RelativeRanks506 r=new RelativeRanks506();
        r.findRelativeRanks(t);
    }
    public String[] findRelativeRanks(int[] score) {
        SortedMap<Integer,Integer> map=new TreeMap<>();
        String[] s=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            map.put(score[i],i);
        }

        int rank=1;//"Gold Medal","Silver Medal","Bronze Medal
        for(int i=0;i<score.length;i++)
        {
            if(i==0)
            {
                int k=map.get(map.lastKey());
                map.remove(map.lastKey());
                s[k]="Gold Medal";
                rank+=1;
            } else if (i==1) {

                int k=map.get(map.lastKey());
                map.remove(map.lastKey());
                s[k]="Silver Medal";
                rank+=1;
            }
            else if (i==2) {

                int k=map.get(map.lastKey());
                map.remove(map.lastKey());
                s[k]="Bronze Medal";
                rank+=1;
            }
            else{
                int k=map.get(map.lastKey());
                map.remove(map.lastKey());
                s[k]=Integer.toString(rank);
                rank+=1;
            }

        }
        return s;
    }
}
