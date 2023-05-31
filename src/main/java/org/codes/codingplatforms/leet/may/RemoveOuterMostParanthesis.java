package org.codes.codingplatforms.leet.may;

import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        RemoveOuterMostParanthesis r=new RemoveOuterMostParanthesis();
        r.removeOuterParentheses(s);
    }
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        String t="";
        int n=s.length();
        int i=0;
        int startPos=0;
        int endPos=0;
        while (endPos<n)
        {
            if(s.charAt(endPos)=='(')
            {
                stack.push('(');
                endPos+=1;

            }
            else {
                stack.pop();
                endPos+=1;
            }
            if(stack.size()==0)
            {
                t+=s.substring(startPos+1,endPos-1);
                startPos=endPos;
            }
        }
        return t;
    }
    private String removePara(String s)
    {
        return s.substring(1,s.length()-1);
    }
}
