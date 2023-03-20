package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        MoveZeroToEnd m=new MoveZeroToEnd();
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,0,0,2,3,0,6));
        pushZerosAtEnd(arrayList);
    }
    public static void pushZerosAtEnd(ArrayList<Integer> arr)
    {
        int l=arr.size();
        int count=0;
        for(Integer i:arr)
        {
            if(i==0)
            {
                count+=1;
            }
        }
        int pos=0;
        for(int i=0;i<l;i++)
        {
            if(arr.get(i)!=0)
            {
                arr.set(pos,arr.get(i));
                pos+=1;
            }
        }
        for(int i=l-count;i<l;i++)
        {
            arr.set(i,0);
        }
    }
}
