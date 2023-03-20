package org.codes.codingplatforms.leet.january2023;

import java.util.HashMap;
import java.util.Map;

public class FIndTheTownJudge {
    public static void main(String[] args) {
        //[[1,3],[1,4],[2,3],[2,4],[4,3]]
        int t[][]=new int[][]{{1,3},{2,3},{1,4},{2,4},{4,3}};
        System.out.println(findJudge(4,t));
    }
    public static int findJudge(int n, int[][] trust) {
        int intrust[]=new int[n+1];
        int outtrust[]=new int[n+1];
        for(int i=0;i< trust.length;i++)
        {
            outtrust[trust[i][0]]+=1;
            intrust[trust[i][1]]+=1;

        }
        for(int i=0;i<n+1;i++)
        {
            if(intrust[i]==n-1&&outtrust[i]==0)
            {
                return i;
            }

        }
        return -1;

    }

}
