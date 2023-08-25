package org.codes.codingplatforms.gfg.Month8;

import java.util.HashSet;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        FindMissingAndRepeating.findTwoElement(new int[]{2,2},2);
    }
    static int[] findTwoElement(int arr[], int n) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        int repeated=-1;
        int missing=-1;
        for(int i=0;i<n;i++)
        {
            if(set.contains(arr[i]))
            {
                repeated=arr[i];
            }
            else {
                set.add(arr[i]);
            }
        }
        for(int i=1;i<n+1;i++)
        {
            if(!set.contains(i))
            {
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}
