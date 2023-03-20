package org.codes.codingplatforms.codingninjas;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int a[]=new int[]{-40 ,-39, -46, -38, -13 ,-30, -26, -28, -37, -36};
        int t[]=new int[]{2 ,6 ,3 ,1 ,5 ,7 ,4, 8 ,9, 11};
        int p=firstMissing(t,10);
        System.out.println(".............");
        System.out.println(p);

    }
    public static int firstMissing(int[] arr, int n) {
        SortedSet<Integer> sortedSet=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>-1)
            {
                sortedSet.add(arr[i]);
            }
        }
        int k=0;
        for(int i:sortedSet)
        {
            System.out.println(i);
            if(i==k)
            {
                return k;
            }
            k+=1;
        }
        return k;

    }
}
