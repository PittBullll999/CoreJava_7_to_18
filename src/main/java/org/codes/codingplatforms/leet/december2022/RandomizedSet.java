package org.codes.codingplatforms.leet.december2022;

import java.util.*;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet r=new RandomizedSet();
        //["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
        //[[],[1],[2],[2],[],[1],[2],[]]
        System.out.println(r.insert(1));
        System.out.println(r.remove(2));

        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
        System.out.println(r.remove(1));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());

    }
    SortedSet<Integer> treeSet;
    List<Integer> list;
    int size;
    public RandomizedSet() {
        this.treeSet=new TreeSet<>();
        this.list=new ArrayList<>();

        this.size=0;

    }

    public boolean insert(int val) {
        if(treeSet.contains(val))
        {
            return false;
        }
        else {
            treeSet.add(val);
            list.add(val);
            size+=1;
            return true;
        }

    }

    public boolean remove(int val) {
        if(!treeSet.contains(val))
        {
            return false;
        }
        else {
            treeSet.remove(val);
            list.removeIf(i->i==val);
            size-=1;
            return true;
        }

    }

    public int getRandom() {

        return list.get(new Random().nextInt(0,size));

    }
}
