package org.codes.codingplatforms.gfg.Month8;

import java.util.PriorityQueue;

public class KThSmallestNumber {
    public static void main(String[] args) {
        KThSmallestNumber.kthSmallest(new int[]{7,10,4,3,20,15},0,5,3);
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        for(int i=0;i<arr.length;i++)
        {
            pq.offer(arr[i]);
        }
        int kthSmallest=-1;
        for(int i=0;i<k;i++)
        {
            kthSmallest=pq.poll();
        }
        return kthSmallest;
    }
}
