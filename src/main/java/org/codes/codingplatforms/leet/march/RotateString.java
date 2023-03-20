package org.codes.codingplatforms.leet.march;

public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        rotateString(s,goal);

    }
    public static boolean rotateString(String s, String goal) {
        String str=s+s;
        for(int i=0;i<s.length();i++)
        {
            if(str.substring(i,i+s.length()).equals(goal))
            {
                return true;
            }
        }
        return false;

    }
}
