package org.codes.codingplatforms.leet.april;

public class MergeStringAlternatievely {
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqrst";
        MergeStringAlternatievely m=new MergeStringAlternatievely();
        m.mergeAlternately(s1,s2);
    }
    public String mergeAlternately(String word1, String word2) {
        char str[]=new char[word1.length()+word2.length()];
        boolean flag=true;
        int i=0;
        int j=0;
        int po=0;
        while (flag)
        {
            if(i<word1.length()&&j<word2.length())
            {
                str[po]=word1.charAt(i);
                i+=1;
                po+=1;
                str[po]=word2.charAt(j);
                po+=1;
                j+=1;
            }
            if(i==word1.length())
            {
                for(int k=j;k<word2.length();k++)
                {
                    str[po]=word2.charAt(k);
                    po+=1;
                }
                flag=false;
            }
            if(j==word2.length())
            {
                for(int k=i;k<word1.length();k++)
                {
                    str[po]=word1.charAt(k);
                    po+=1;
                }
                flag=false;
            }
            if(i==word1.length()&&j==word2.length())
            {
                flag=false;
            }
        }
        return new String(str);
    }
}
