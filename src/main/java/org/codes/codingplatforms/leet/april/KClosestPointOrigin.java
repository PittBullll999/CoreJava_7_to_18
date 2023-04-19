package org.codes.codingplatforms.leet.april;

import java.util.*;

public class KClosestPointOrigin {
    public static void main(String[] args) {
        //[3,3],[5,-1],[-2,4]
        int t[][]=new int[][]{{3,3},{5,-1},{-2,4}};
        KClosestPointOrigin k=new KClosestPointOrigin();
        k.kclosest(t,2);
    }
    public int[][] kclosest(int[][] points,int k)
    {
        int t[][]=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->((x[0]*x[0]+x[1]*x[1])-(y[0]*y[0]+y[0]*y[0])));
        for(int []p:points)
        {
            pq.offer(p);

        }
        for(int i=0;i<k;i++)
        {
            int p[]=pq.poll();
            t[i][0]=p[0];
            t[i][1]=p[1];
        }
        return t;
    }
    public int[][] kClosest(int[][] points, int k) {
        int t[][]=new int[k][2];
        SortedMap<Integer, List<String>> map=new TreeMap<>();

        for(int i=0;i<points.length;i++)
        {
            int a=points[i][0];
            int b=points[i][1];
            int dis=(a*a)+(b*b);
            if(map.containsKey(dis))
            {
                List<String> list=map.get(dis);
                list.add(a+","+b);
                map.put(dis,list);
            }
            else {
                List<String> list=new ArrayList<>();
                list.add(a+","+b);
                map.put(dis,list);
            }

        }

        int i=0;
        while (i<k)
        {
            List<String> list=map.get(map.firstKey());
            map.remove(map.firstKey());
            for(String s:list)
            {
                String[] st=s.split(",");
                t[i][0]=Integer.parseInt(st[0]);
                t[i][1]=Integer.parseInt(st[1]);
                i+=1;
            }
        }
        return t;
    }
}
