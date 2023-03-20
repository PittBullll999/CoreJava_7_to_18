package org.codes.codingplatforms.leet.january2023;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InsertIntervel {
    public static void main(String[] args) {
        int k[][]=new int[][]{{1,5}};
        int t[]=new int[]{6,8};
        InsertIntervel i=new InsertIntervel();
        i.insert(k,t);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Stack<int[]> stack=new Stack<>();
        int first=newInterval[0];
        int second=newInterval[1];
        int secpos=0;
        int firstpos=0;
        for(int i=0;i<intervals.length;i++)
        {
            if(newInterval[0]<=intervals[i][1]&&newInterval[0]>=intervals[i][0])
            {
                first=intervals[i][0];
                firstpos=i;
                secpos=i;

            }
            if(newInterval[1]<=intervals[i][1]&&newInterval[1]>=intervals[i][0])
            {
                second=intervals[i][1];
                secpos=i;
            }

        }


        return null;


    }

}
