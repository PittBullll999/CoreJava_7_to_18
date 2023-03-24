package org.codes.codingplatforms.leet.march;

public class AlphabeticSequence2414 {
    public static void main(String[] args) {
        AlphabeticSequence2414 a=new AlphabeticSequence2414();
        a.longestContinuousSubstring("abcab");

    }
    public int longestContinuousSubstring(String s) {
        int count=1;
        int max=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(Integer.valueOf(s.charAt(i+1))==Integer.valueOf(s.charAt(i))+1)
            {
                count+=1;
                if(count>max)
                {
                    max=count;
                }
            }
            else {
                count=1;
            }
        }
        return max;
    }
}
