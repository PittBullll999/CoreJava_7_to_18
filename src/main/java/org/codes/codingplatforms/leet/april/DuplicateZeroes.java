package org.codes.codingplatforms.leet.april;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                list.add(i);
            }
        }
    }
}
