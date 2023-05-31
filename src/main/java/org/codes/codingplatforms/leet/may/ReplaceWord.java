package org.codes.codingplatforms.leet.may;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWord {
    public static void main(String[] args) {
        ReplaceWord r=new ReplaceWord();
        r.replaceWords(List.of("cat","bat","rat"),"the cattle was rattled by the battery");
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        String k="";
        String[] slist=sentence.split(" ");
        for(String str:dictionary)
        {
            set.add(str);
        }
        for(int i=0;i<slist.length;i++)
        {
            slist[i]=checkSet(slist[i],set);
        }
        for(int i=0;i<slist.length;i++)
        {
            k+=slist[i]+" ";
        }
        return k.trim();
    }
    private String checkSet(String s,Set<String> set)
    {
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.substring(0,i)))
            {
                return s.substring(0,i);
            }
        }
        return s;
    }
}
