package org.codes.codingplatforms.codingninjas;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr)     {

        HashSet<Integer> hashSet=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        arr.stream().forEach(
                i->{
                    if(!hashSet.contains(i))
                    {
                        list.add(i);
                        hashSet.add(i);
                    }
                }
        );
        return list;

    }
}
