package org.codes.codingplatforms.codingninjas;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int findMajority(int[] arr, int n) {

        int max = arr[0];
        int len=arr.length;
        int flr=(int)Math.floor(len/2);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
            if(hashMap.get(arr[i])>flr)
            {
                return arr[i];
            }
        }

        return -1;



    }
}
