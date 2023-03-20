package org.codes.codingplatforms.codingninjas;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        ReverseStringWordWise r=new ReverseStringWordWise();
        reverseStringWordWise("Welcome to Coding Ninjas");
    }
    static String reverseStringWordWise(String input) {
        String[] s=input.split(" ");
        String ss="";
        for(int i=0;i<s.length;i++)
        {
            String p=s[i];
            ss=p+" "+ss;


        }
        System.out.println(ss);

        return ss;
    }
}
