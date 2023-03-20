package org.codes.codingplatforms.leet.december2022;

import java.util.*;

public class SmallestInfiniteSet {
    SortedSet<Integer> sortedSet;
    int smallest;
    public SmallestInfiniteSet() {

        smallest=1;
        sortedSet=new TreeSet<>();
        for(int i=1;i<2001;i++)
        {
            sortedSet.add(i);
        }

    }

    public int popSmallest() {
        int t=smallest;
        sortedSet.remove(smallest);
        smallest=sortedSet.first();
        return t;

    }

    public void addBack(int num) {
        if(!sortedSet.contains(num))
        {
            if(num<smallest)
            {
                sortedSet.add(num);
                smallest=num;
            }
            else {
                sortedSet.add(num);
            }
        }

    }
}
