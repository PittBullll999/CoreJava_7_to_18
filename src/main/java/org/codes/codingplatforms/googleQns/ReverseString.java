package org.codes.codingplatforms.googleQns;

public class ReverseString {
    public static void main(String[] args) {
        String s="Abhinav";
        String e="";
        for(char c:s.toCharArray())
        {
            e=c+e;
        }
        System.out.println(e);
    }
}
