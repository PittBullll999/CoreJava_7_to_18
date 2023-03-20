package org.codes.codingplatforms.leet.january2023;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrows {
    public static void main(String[] args) {
        int k[][]=new int[][]{{10,16},{2,8},{1,6},{7,12}};
        findMinArrowShots(k);
    }
    public static int findMinArrowShots(int[][] points) {
        if(points.length==1)
        {
            return 1;
        }
        //Arrays.sort(points, Comparator.comparingDouble(o->o[0]));
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        int pos=points[0][1];
        int count=1;
        Arrays.stream(points).forEach(i-> System.out.println(i[0]+" "+i[1]));
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>pos)
            {

                count+=1;
                pos=points[i][1];
            }
        }
        System.out.println(count);
        return count;

    }
}
