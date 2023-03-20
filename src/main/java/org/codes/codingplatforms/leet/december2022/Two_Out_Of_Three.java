package org.codes.codingplatforms.leet.december2022;

import java.util.ArrayList;
import java.util.List;

public class Two_Out_Of_Three {
    public static void main(String[] args) {
        twoOutOfThree(new int[]{1,2,3},new int[]{2,3,6},new int[]{7,8,5,3});

    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int t1[]=new int[101];
        int t2[]=new int[101];
        int t3[]=new int[101];
        for(int i:nums1)
        {
            t1[i]=1;
        }

        for(int i:nums2)
        {
            t2[i]=1;
        }
        for(int i:nums3)
        {
            t3[i]=1;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<101;i++)
        {
            if((t1[i]+t2[i]+t3[i])>1)
            {
                list.add(i);
            }
        }
        System.out.println(list.toString());
        return list;

    }
}
