package org.codes.codingplatforms.leet.january2023;

public class FlipString {
    public int minFlipsMonoIncr(String s) {
        int one=0;
        int flip=0;
        int length=s.length();
        char[] c=s.toCharArray();
        for(int i=0;i<length;i++)
        {
            if(c[i]=='0')
            {
                if(one==0)
                {
                    continue;
                }
                else {
                    flip+=1;
                }
            }
            else{
                one+=1;
            }
        }
        if(one<flip)
        {
            flip=one;
        }
        return flip;



    }
}
