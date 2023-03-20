package org.codes.codingplatforms.leet.january2023;

import java.util.*;

public class ConcatenatedWords {
    Set<String> set=new HashSet<>();
    Set<String> set1=new HashSet<>();

    public static void main(String[] args) {
        String[] s=new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        ConcatenatedWords c=new ConcatenatedWords();
        c.findAllConcatenatedWordsInADict(s);
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> list=new ArrayList<>();

        for(String word:words)
        {
            set.add(word);
            set1.add(word);
        }
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else{
                    String p=words[i]+words[j];
                    if(set1.contains(p))
                    {
                        list.add(p);
                    }
                    else {
                        set.add(p);
                    }
                }

            }
        }
        System.out.println(list);
        return list;

    }
}
