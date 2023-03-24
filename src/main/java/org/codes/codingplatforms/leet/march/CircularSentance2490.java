package org.codes.codingplatforms.leet.march;

public class CircularSentance2490 {
    public static void main(String[] args) {
        CircularSentance2490 c=new CircularSentance2490();
        c.isCircularSentence("leetcode exercises sound delightful");
    }
    public boolean isCircularSentence(String sentence) {
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)==' '&&sentence.charAt(i-1)!=sentence.charAt(i+1))
            {

                    return false;

            }
        }
        if(first!=last)
        {
            return false;
        }
        return true;

    }
}
