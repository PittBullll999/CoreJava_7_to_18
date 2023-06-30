package org.codes.codingplatforms.leet.june;

import java.util.Stack;

public class ReverseSubStringBetweenPairs {
    public static void main(String[] args) {
        ReverseSubStringBetweenPairs r=new ReverseSubStringBetweenPairs();
        r.reverseParentheses("(ed(et(oc))el)");
    }
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == ')') {
                popUntil(stack);
            } else {
                stack.push(c);
            }
        }
        String str = "";
        while (!stack.isEmpty())
        {
            char ch=stack.pop();
            str=ch+str;
        }
        return str;
    }
    private void popUntil(Stack<Character> stack)
    {
        boolean flag=true;
        String s="";
        while (flag)
        {
            Character c=stack.pop();
            if(c=='(')
            {
                flag=false;
            }
            else {
                s+=c;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
    }
}
