package org.codes.codingplatforms.leet.january2023;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class DistinctIntegers {
    public static void main(String[] args) {
        DistinctIntegers d=new DistinctIntegers();
        System.out.println(d.reverse(140));
        d.countDistinctIntegers(new int[]{1,13,10,12,31});
    }
    public int countDistinctIntegers(int[] nums) {
        SortedSet<Integer> sortedSet=new TreeSet<>();
        Arrays.stream(nums).forEach(i->{
            sortedSet.add(i);
            int r=reverse(i);
            sortedSet.add(r);


        });

        return sortedSet.size();
    }
    private int reverse(int num)
    {
        String str=Integer.toString(num);
        String nstr="";
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return Integer.parseInt(nstr);
    }

}
