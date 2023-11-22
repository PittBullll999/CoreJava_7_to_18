package org.codes.codingplatforms.gfg.Month8;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.TreeMap;

public class RearrangeNegAndPos {
    public static void main(String[] args) {
        RearrangeNegAndPos r=new RearrangeNegAndPos();
        r.segragateElement(new int[]{1, -1, 3, 2, -7, -5, 11, 6},8);
    }
    public void segragateElement(int arr[],int n)
    {
        Queue<Integer> negQueue=new ArrayDeque<>();
        Queue<Integer> posQueue=new ArrayDeque<>();
        for(int i:arr)
        {
            if(i<0)
            {
                negQueue.offer(i);
            }
            else {
                posQueue.offer(i);
            }
        }
        int i=0;
        while (!posQueue.isEmpty())
        {
            arr[i]=posQueue.poll();
            i+=1;
        }
        while (!negQueue.isEmpty())
        {
            arr[i]=negQueue.poll();
            i+=1;
        }
    }
    public void segregateElements(int arr[], int n)
    {
        int pos=0;
        int neg=Integer.MIN_VALUE;
        SortedMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                map.put(pos,arr[i]);
                pos+=1;
            }
            else {
                map.put(neg,arr[i]);
                neg+=1;
            }
        }
        int negsize=neg-Integer.MIN_VALUE;
        int posSize=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getKey()<0)
            {
                arr[arr.length-negsize]=entry.getValue();
                negsize-=1;
            }
            else {
                arr[posSize]=entry.getValue();
                posSize+=1;
            }
        }
    }
}
