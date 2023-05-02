package org.codes.codingplatforms.interviewbit.april;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Klargestelement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(3);
        list.add(4);
        list.add(6);
        Klargestelement k=new Klargestelement();
        k.solve(list,3);
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((x, y)->y-x);
        for(int i:A)
        {
            pq.offer(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<B;i++)
        {
            list.add(pq.remove());
        }
        return list;
    }
}
