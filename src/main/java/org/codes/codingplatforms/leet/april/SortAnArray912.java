package org.codes.codingplatforms.leet.april;

import java.util.PriorityQueue;

public class SortAnArray912 {
    public static void main(String[] args) {
        int t[]=new int[]{5,2,5,1,6,7,4,3,77,84,21};
        SortAnArray912 s=new SortAnArray912();
        s.sortArray(t);
    }
    public int[] sortArray(int[] nums) {
        int t[]=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->x-y);
        for(int i:nums)
        {
            pq.offer(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            t[i]=pq.poll();
        }
        return t;
    }

}
