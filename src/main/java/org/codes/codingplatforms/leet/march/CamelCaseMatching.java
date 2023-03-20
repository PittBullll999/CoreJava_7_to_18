package org.codes.codingplatforms.leet.march;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CamelCaseMatching {
    public static void main(String[] args) {
        String[] s=new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        CamelCaseMatching c=new CamelCaseMatching();
        c.camelMatch(s,"FB");
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            String ss="";
            for(char c:queries[i].toCharArray())
            {
                if(c>64&&c<91)
                {
                    ss+=c;
                }
            }
            if(ss.equals(pattern))
            {
                list.add(true);
            }
            else list.add(false);
        }
        return list;

    }
}
