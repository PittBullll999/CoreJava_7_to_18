package org.codes.codingplatforms.leet.december2022;

import java.util.HashSet;

public class Substring_Of_Size_Three {
    public static void main(String[] args) {
        String s="xyzzaz";
        countGoodSubstrings(s);
    }
    public static int countGoodSubstrings(String s) {
        HashSet<Character> characters=new HashSet<>();
        char c[]=s.toCharArray();
        characters.add(c[0]);
        characters.add(c[1]);
        characters.add(c[2]);
        int count=0;
        if(characters.size()==3)
        {
            count+=1;
        }

        for(int i=3;i<c.length;i++)
        {
            characters.remove(c[i-3]);
            System.out.println(s.substring(i-3,i));
            if(!characters.contains(c[i]))
            {
                System.out.println("charecotor :"+c[i]);
                characters.add(c[i]);
                count+=1;
            }
        }
        System.out.println(count);
        return count;

    }
}
