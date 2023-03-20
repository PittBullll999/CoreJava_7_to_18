package org.codes.codingplatforms.leet.january2023;

import java.util.*;

public class MaximumPointsOnline {
    public static void main(String[] args) {
        int p[][]=new int[][]{{1,1},{2,2},{3,3}};
        //[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]
        MaximumPointsOnline m=new MaximumPointsOnline();
        m.maxPoints(p);
    }
    public int maxPoints(int[][] points) {
        if(points.length==1)
        {
            return 1;
        }
        HashMap<String, HashSet<List<Integer>>> hashMap=new HashMap<>();
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                String t=(lineFromPoints(points[i],points[j]));
                if(hashMap.containsKey(t))
                {
                    HashSet<List<Integer>> list=hashMap.get(t);
                    list.add(Arrays.asList(points[i][0],points[i][1]));
                    list.add(Arrays.asList(points[j][0],points[j][1]));
                    hashMap.put(t,list);
                }
                else {
                    HashSet<List<Integer>> list=new HashSet<>();
                    list.add(Arrays.asList(points[i][0],points[i][1]));
                    list.add(Arrays.asList(points[j][0],points[j][1]));
                    hashMap.put(t,list);

                }


            }
        }

        int ma=0;
        for(Map.Entry<String,HashSet<List<Integer>>> entry:hashMap.entrySet())
        {
            if(entry.getValue().size()>ma)
            {
                ma=entry.getValue().size();
            }
        }
        System.out.println(ma);
        return ma;

    }

    private String lineFromPoints(int p[], int q[]) {

        int a = q[1] - p[1];
        int b = p[0] - q[0];
        int c = a * (p[0]) + b * (p[1]);


        if (b < 0) {
            int t=GCD(Math.abs(a),Math.abs(b));
            a=(int)(a/t);
            b=(int)(b/t);
            c=(int)(c/t);
            return (a + "x-" + b + "y=" + c);
        } else {
            int t=GCD(Math.abs(a),Math.abs(b));
            a=(int)(a/t);
            b=(int)(b/t);
            c=(int)(c/t);

            return (a + "x+" + b + "y=" + c);
        }

    }
    private int GCD(int x, int y)
    {
        if (y == 0)
            return x;
        return GCD(y, x % y);
    }
}
