package org.codes.codingplatforms.codingninjas;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate2 {
    public static boolean checkDuplicate(int[] arr, int n, int k) {
        HashMap<Integer,Integer> hashSet=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            if(hashSet.containsKey(arr[i]))
            {
                return true;
            }
            else {
                hashSet.put(arr[i],1);
            }
        }
        for(int i=k;i<n;i++)
        {
            if(hashSet.get(arr[i-k])==1)
            {
                hashSet.remove(arr[i-k]);
            }
            else {
                hashSet.put(arr[i-k],hashSet.get(arr[i-k])-1);
            }
            if(hashSet.containsKey(arr[i]))
            {
                return true;
            }

        }
        return false;

    }
}
