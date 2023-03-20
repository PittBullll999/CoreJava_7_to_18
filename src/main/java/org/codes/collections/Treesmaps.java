package org.codes.collections;

import java.util.*;

public class Treesmaps {
    public static void main(String[] args) {
        treeMap();

    }
    public static TreeMap<Integer,Integer> treeMap()
    {
        List<Integer> integers= Arrays.asList(1,2,3,4,99,80,76,0,5,7,8,4,2,1);
        TreeSet<Integer> tr=new TreeSet<>(integers);

        Object n[]=tr.toArray();
        Arrays.stream(n).forEach(System.out::println);
        return null;

    }
}
