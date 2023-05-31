package org.codes.codingplatforms.leet.may;

import java.util.*;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] list=new String[]{"flower","flow","flight"};
        LongestCommonPrefix l=new LongestCommonPrefix();
        l.longestCommonPrefix(list);
    }
    public String longestCommonPrefix(String[] strs) {
        
//        PriorityQueue<String> pq=new PriorityQueue<>((x,y)->x.length()-y.length());
//        for(String s:strs)
//        {
//            pq.offer(s);
//        }
//        List<String> list=pq.stream().collect(Collectors.toList());
//        list.stream().forEach(System.out::println);
        List<String> list= Arrays.stream(strs).sorted().collect(Collectors.toList());
        String st="";
        for(int i=0;i<list.get(0).length();i++)
        {
            char c=list.get(0).charAt(i);
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j).charAt(i)!=c)
                {
                    return st;
                }


            }
            st+=c;
        }



        return st;


    }
}
