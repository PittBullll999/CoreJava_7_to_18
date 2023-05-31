package org.codes.codingplatforms.leet.may;

public class ReplaceAllDigitWithCharectors {
    public static void main(String[] args) {
        String s="a0b9";
        ReplaceAllDigitWithCharectors r=new ReplaceAllDigitWithCharectors();
        r.replaceDigits(s);
    }
    public String replaceDigits(String s) {
        char t[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int m=t[i];
            System.out.println(m);

        }
        return t.toString();
    }
}
