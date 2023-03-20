package org.codes.codingplatforms.leet.december2022;

import java.util.HashSet;

public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String s[]=new String[]{"ad","bd","aaab","baa","badab"};
        String p="abd";
        countConsistentStrings(p,s);

    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hashSet=new HashSet<>();
        for(char i:allowed.toCharArray())
        {
            hashSet.add(i);
        }
        int count=words.length;
        for(String s:words)
        {
            for(char i:s.toCharArray())
            {
                if(!hashSet.contains(i))
                {
                    count-=1;
                    break;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
