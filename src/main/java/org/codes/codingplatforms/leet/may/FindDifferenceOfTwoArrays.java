package org.codes.codingplatforms.leet.may;

import java.util.*;
import java.util.stream.Collectors;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int t[]=new int[]{1,2,3,3};
        int t2[]=new int[]{1,1,2,2};
        FindDifferenceOfTwoArrays f=new FindDifferenceOfTwoArrays();
        f.findDifference(t,t2);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1)
        {
            set1.add(i);
        }
        for(int i:nums2)
        {
            set2.add(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(set2.contains(nums1[i]))
            {
                nums1[i]=1001;
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                nums2[i]=1001;
            }
        }
        List<Integer> list1= Arrays.stream(nums1).boxed().filter(i->i!=1001).distinct().collect(Collectors.toList());
        List<Integer> list2= Arrays.stream(nums2).boxed().filter(i->i!=1001).distinct().collect(Collectors.toList());
        return List.of(list1,list2);
    }
}
