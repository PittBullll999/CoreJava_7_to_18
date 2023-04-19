package org.codes.codingplatforms.leet.april;

import java.util.Stack;

public class RemoveOccuranceSubstring1910 {
    public static void main(String[] args) {
        String s="axxxxyyyyb";
        String part="xy";
        RemoveOccuranceSubstring1910 r=new RemoveOccuranceSubstring1910();
        String p=r.removeOccurrences(s,part);
    }
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack=new Stack<>();


        int i=0;
        boolean flag=true;
        while (flag)
        {
            if(stack.size()<2)
            {
                stack.push(s.charAt(i));
                i+=1;
            }
            else {
                if(i==s.length()&&!last3element(stack,part.length()).equals(part))
                {
                    flag=false;
                }
                stack.push(s.charAt(i));
                i+=1;
                String ss=last3element(stack,part.length());

                if(ss.equals(part))
                {
                    for(int m=0;m<part.length();m++)
                    {
                        stack.pop();
                    }
                }


            }

        }
        String pp="";

        for(int j=0;j<stack.size();j++)
        {
            pp+=stack.pop();
        }
        return pp;

    }
    private String last3element(Stack<Character> stack,int n)
    {
        String ss="";
        for(int j=1;j<n+1;j++)
        {
            ss=stack.get(stack.size()-j)+ss;
        }
        return ss;
    }
}
