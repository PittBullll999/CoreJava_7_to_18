package org.codes.codingplatforms.leet.december2022;

import java.util.HashSet;

public class BrokenLetters {
    public static void main(String[] args) {
        String text="leet  code ";
        String br="e";
        //System.out.println(canBeTypedWords(text,br));
    }
    public  int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> characters=new HashSet<>();
        for(Character c:brokenLetters.toCharArray())
        {
            characters.add(c);
        }
        String tex[]=text.split(" ");
        int n=tex.length;
        for(String s:tex )
        {
            for(char c:s.toCharArray())
            {
                if(characters.contains(c))
                {
                    n-=1;
                }
            }
        }
        return n;

    }
}
