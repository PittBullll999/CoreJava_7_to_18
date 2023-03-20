package org.codes.codingplatforms.leet.february;


public class GreatestLetter {
    public static void main(String[] args) {
        String s="lEeTcOdE";
        GreatestLetter g=new GreatestLetter();
        System.out.println(g.greatestLetter(s));
    }
    public String greatestLetter(String s) {
        int[] lowerCase=new int[26];
        int[] upperCase=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>64&&t<91)
            {

                upperCase[t-'A']+=1;
            }
            if(t>96&&t<123)
            {
                lowerCase[t-'a']+=1;
            }
        }
        String str="";

        for(int i=0;i<26;i++)
        {
            if(lowerCase[i]>0&&upperCase[i]>0)
            {
                str=String.valueOf((char) (i+65));
            }
        }

        return str;

    }
}
