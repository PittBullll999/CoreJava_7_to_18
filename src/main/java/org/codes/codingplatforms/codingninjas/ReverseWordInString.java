package org.codes.codingplatforms.codingninjas;

public class ReverseWordInString {
    public static String reverseString(String str)
    {
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++)
        {
            s[i]=s[i].trim();
        }
        String k="";
        for(String i:s)
        {
            k=i+" "+k;
        }
        return k;
    }
}
