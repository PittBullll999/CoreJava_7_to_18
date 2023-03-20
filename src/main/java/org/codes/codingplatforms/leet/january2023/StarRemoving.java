package org.codes.codingplatforms.leet.january2023;

import java.util.Stack;

public class StarRemoving {
    public static void main(String[] args) {
        String s="erase*****";
        StarRemoving star=new StarRemoving();
        System.out.println(star.removeStars(s));

    }
    public String removeStars(String s) {
        String t="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                stack.pop();

            }
            else {
                stack.push(s.charAt(i));
            }
        }
        int k=stack.size();
        char c[]=new char[k];
        int m=k-1;

        while(stack.size()>0)
        {
            c[k]=stack.pop();
            k-=1;
        }
        return String.valueOf(c);


    }
}
