package org.codes.codingplatforms.leet.june;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String {
    public static void main(String[] args) {
        Remove_All_Adjacent_Duplicates_in_String r=new Remove_All_Adjacent_Duplicates_in_String();
        r.removeDuplicates("pbbcggttciiippooaais",2);
    }


    public String removeDuplicates(String s, int k) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            //System.out.println(stack.get(0));
            if(stack.size()>k-1)
            {
                checkTopN(stack,k);

            }
            stack.push(s.charAt(i));
           // System.out.println(stack.get(stack.size()-1));
        }
        String s1="";
        while (!stack.isEmpty())
        {
            s1=stack.pop()+s1;
        }
        //System.out.println(s1);
        return s1;

    }
    public void checkTopN(Stack<Character> stack,int n)
    {
        String s="";
        s+=stack.peek();
        for(int i=1;i<n;i++)
        {
            Character c=stack.get(stack.size()-i-1);
            if(c!=s.charAt(s.length()-1))
            {
                return ;
            }
            s+=c;
        }
        for(int i=0;i<n;i++)
        {
            stack.pop();
        }



    }

}
