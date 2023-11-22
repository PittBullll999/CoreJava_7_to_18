package org.codes.codingplatforms.gfg.Month8;

import java.util.HashSet;

public class RearrangeArray {
    public static void main(String[] args) {
        RearrangeArray.modifyArray(new int[]{-1, -1, 6, 1, 9, 3, 2,
                -1, 4, -1},9);
    }
    public static int[] modifyArray (int arr[], int n) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        for(int i=0;i<n;i++)
        {
            if(set.contains(i))
            {
                arr[i]=i;
            }
            else {
                arr[i]=-1;
            }
        }
        return arr;
    }
}
