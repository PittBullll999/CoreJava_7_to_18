package org.codes.codingplatforms.leet.january2023;

import java.util.SortedSet;
import java.util.TreeSet;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] t=new int[]{5,4,3,2,1};
        RelativeRanks r=new RelativeRanks();
        r.findRelativeRanks(t);
    }
    public String[] findRelativeRanks(int[] score) {
        SortedSet<Integer> s=new TreeSet<>();
        for(int i:score)
        {
            s.add(i);
        }
        System.out.println(s);
        System.out.println(s.last());
        s.remove(s.last());
        System.out.println(s.last());
        return new String[]{"has"};

    }
}
