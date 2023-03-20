package org.codes.codingplatforms.leet.january2023;

public class DetectCapital {
    public static void main(String[] args) {
        DetectCapital d=new DetectCapital();
        System.out.println(d.detectCapitalUse("A"));
    }
    public boolean detectCapitalUse(String word) {
        int k=word.charAt(0);
        boolean t=(k>=65 && k<=90);
        if(!t&&word.length()>0)
        {
            for(int i=1;i<word.length();i++)
            {
                int m=word.charAt(i);
                if(!(m>=97 && m<=122))
                {
                    return false;
                }
            }
        }
        if(t && (word.length()>1))
        {
            if(word.charAt(1)>=65&&word.charAt(1)<=90)
            {
                for(int i=2;i<word.length();i++)
                {
                    int m=word.charAt(i);
                    if(!(m<=90&&m>=65))
                    {
                        return false;
                    }
                }
            }
            else {
                for(int i=1;i<word.length();i++)
                {
                    int m=word.charAt(i);
                    if (!(m >= 97 && m <= 122))
                     {

                        return false;
                    }
                }
            }
        }
        return true;

    }
}
