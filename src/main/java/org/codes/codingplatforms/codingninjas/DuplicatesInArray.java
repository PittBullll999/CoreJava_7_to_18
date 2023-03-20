package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesInArray {
    public static ArrayList<Integer> findDuplicates(int[] arr, int n) {
        int t[]=new int[]{};
        for(int i:arr)
        {
            t[arr[i]]+=1;
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:t)
        {
            if(t[i]>1)
            {
                a.add(i);
            }
        }
        return a;
        // Write your code here.
    }
}
